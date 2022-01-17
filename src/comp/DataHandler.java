package comp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataHandler
{
    private final Map<String, Symbol> DataSymbolMap = new HashMap<>();
    private long memoryEndPointer;
    private final String errorTextColor = "\\u001B31;1m";
    private final List<Variable> variables = new ArrayList<>();
    private long currLine, currColumn;
    private long errorCounter = 0;
    private boolean errorFound = false;
    private long forSymbolsIterator = 0;
    public boolean checkIfSymbolExists(String name)
    {
        return DataSymbolMap.get(name) != null;
    }

    public long addSymbol(String name)
    {
        if(checkIfSymbolExists(name))
        {
            System.out.println(errorTextColor + " " + name + " is already defined at " + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return -1;
        }

        long offset = allocMemorySingle();
        DataSymbolMap.put(name, new Symbol(name, offset));
        return offset;
    }

    public long addArray(String name, long begin, long end)
    {
        if(checkIfSymbolExists(name))
        {
            System.out.println(errorTextColor + " " + name + " is already defined at " + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return -1;
        }

        if(end < begin)
        {
            System.out.println(errorTextColor + " " + name + " array end index smaller than start index" + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return -1;
        }

        long offset = allocMemoryArr(end - begin + 1);
        DataSymbolMap.put(name, new Symbol(name, offset, begin, end));
        return offset;
    }

    public long addIterator(String name)
    {
        if(checkIfSymbolExists(name))
        {
            if(!DataSymbolMap.get(name).isIterator())
            {
                System.out.println(errorTextColor + " " + name + " already defined non-iterator with this name" + currLine + ":" + currColumn + ".");
                errorFound = true;
                errorCounter++;
                return -1;
            }
            return DataSymbolMap.get(name).getOffset();
        }

        long offset = allocMemorySingle();
        DataSymbolMap.put(name, new Symbol(name, offset, true, true));
        return offset;
    }

    public String addIteratorSymbol()
    {
        String name = "!" + forSymbolsIterator;
        forSymbolsIterator++;

        addSymbol(name);

        return name;
    }
    public long addValue(long value)
    {
        String name = (String.valueOf(value));

        if(checkIfSymbolExists(name))
        {
            return DataSymbolMap.get(name).getOffset();
        }

        long offset = allocMemorySingle();
        Symbol sym = new Symbol(name, offset);
        DataSymbolMap.put(name, sym);
        return offset;
    }

    public Variable getValue(long value)
    {
        return new Variable(-1, addValue(value), value);
    }

    public Variable getVariable(String name)
    {
        Symbol sym = DataSymbolMap.get(name);

        if(sym.isArray())
        {
            System.out.println(errorTextColor + " " + name + " cant use array as variable" + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return null;
        }

        return new Variable(sym.getOffset());
    }


    public Variable getArrValNum(String name, long pos)
    {
        Symbol sym = DataSymbolMap.get(name);

        if(sym == null)
        {
            return null;
        }

        if(!sym.isArray())
        {
            System.out.println(errorTextColor + " " + name + " variable is not an array" + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return null;
        }

        if(sym.getArrayEndIdx() < pos || sym.getArrayBeginIdx() > pos )
        {
            System.out.println(errorTextColor + " " + name + "[" + pos + "] out of ponds in " + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return null;
        }
        Variable ret = new Variable(sym.getOffset() + pos - sym.getArrayBeginIdx());
        ret.arrayOffset = sym.getArrayBeginIdx();
        return ret;
    }

    public Variable getArrValVar(String name, String pos_name)
    {
        Symbol sym = DataSymbolMap.get(name);
        Symbol pos = DataSymbolMap.get(pos_name);

        if(sym == null || pos == null)
        {
            return null;
        }
        if(!sym.isArray())
        {
            System.out.println(errorTextColor + " " + name + " variable is not an array" + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return null;
        }
        else if(pos.isArray())
        {
            System.out.println(errorTextColor + " " + name + " position symbol is an array" + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return null;
        }

        Variable ret = new Variable(sym.getOffset(), pos.getOffset());
        ret.arrayOffset = sym.getArrayBeginIdx();
        return ret;
    }


    public void setLocation(long lineNo, long columnNo)
    {
        this.currColumn = columnNo;
        this.currLine = lineNo;
    }

    private long allocMemorySingle()
    {
        memoryEndPointer++;
        return memoryEndPointer-1;
    }

    private long allocMemoryArr(long size)
    {
        long beginPointer = memoryEndPointer;
        memoryEndPointer+=size;
        return beginPointer;
    }

    private void freeMemSingle()
    {
        memoryEndPointer--;
    }

    public Variable initVariable(Variable var, String name)
    {
        if(checkIfSymbolExists(name))
        {
            Symbol sym = DataSymbolMap.get(name);
            if(sym.isIterator() && var.getArrayAddress() == -1)
            {
                System.out.println(errorTextColor + " " + name + " iterator cannot be modfied" + currLine + ":" + currColumn + ".");
                errorFound = true;
                errorCounter++;
            }
            else
            {
                sym.setInitialized(true);
            }
        }
        if(var == null)
        {
            return createNonExistingSymbolPlaceHolder();
        }

        return var;
    }

    public boolean checkVariable(String name)
    {
        Symbol sym = DataSymbolMap.get(name);

        if(sym == null)
        {
            System.out.println(errorTextColor + " " + name + " trying to reach not existing symbol" + currLine + ":" + currColumn + ".");
            errorFound = true;
            errorCounter++;
            return false;
        }

        return true;
    }

    public ForLabel createForLabel(String iteratorName, Variable start, Variable end)
    {
        return new ForLabel(getVariable(iteratorName),start, end);
    }

    public long getErrorCounter() {
        return errorCounter;
    }

    public boolean isErrorFound() {
        return errorFound;
    }

    public Variable createNonExistingSymbolPlaceHolder()
    {
        return new Variable();
    }
}
