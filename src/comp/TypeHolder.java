package comp;

public class TypeHolder
{
    private final String stringData;
    private final Variable variableData;
    private final boolean isString;
    private final boolean isVariable;


    public TypeHolder(String s)
    {
        stringData = s;
        isString = true;
        variableData = null;
        isVariable = false;
    }

    public TypeHolder(Variable v)
    {
        variableData = v;
        isVariable = true;
        stringData = null;
        isString = false;
    }

    public String getStringData()
    {
        return stringData;
    }

    public Variable getVariableData()
    {
        return variableData;
    }

    public boolean isString()
    {
        return isString;
    }

    public boolean isVariable()
    {
        return isVariable;
    }
}
