package comp;

public class Variable
{
    private final long address;
    private final long arrayAddress;
    long arrayOffset;
    private long value;
    private boolean isSet;
    Symbol symbol;

    //EMPTY WRONG INITIALIZED VARIABLE HOLDER
    public Variable()
    {
        address = 0;
        value = -1;
        arrayAddress = -1;
    }

    public Variable(long address)
    {
        this.address = address;
        arrayAddress = -1;
        isSet = true;
    }

    public Variable(long address, long arrayAddress)
    {
        this.address = address;
        this.arrayAddress = arrayAddress;
        isSet = true;
    }

    public Variable(long address, long arrayAddress, long value)
    {
        this.address = address;
        this.arrayAddress = arrayAddress;
        this.value = value;
        isSet = false;
    }

    public long getArrayAddress()
    {
        return arrayAddress;
    }

    public long getAddress()
    {
        return address;
    }

    public long getValue()
    {
        return value;
    }

    public void setValue(long value)
    {
        this.value = value;
    }

    public boolean isSet() {
        return isSet;
    }

    public void setSet(boolean set) {
        isSet = set;
    }
}
