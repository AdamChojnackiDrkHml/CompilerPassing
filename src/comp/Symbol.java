package comp;

public class Symbol
{

    //Core values
    private final String name;
    private long offset;
    private long value;

    //Definition Control
    private boolean isInitialized;
    private final boolean isArray;
    private final boolean isIterator;

    //Array fields
    private final long size;
    private final long arrayBeginIdx;
    private final long arrayEndIdx;

    public Symbol(String name, long offset)
    {
        this.name = name;
        this.offset = offset;

        isInitialized = false;
        isArray = false;
        isIterator = false;

        size = 1;
        arrayBeginIdx = 0;
        arrayEndIdx = 0;
    }

    public Symbol(String name, long offset, long arrayBeginIdx, long arrayEndIdx)
    {
        this.name = name;
        this.offset = offset;

        isInitialized = true;
        isArray = true;
        isIterator = false;

        size = arrayEndIdx - arrayBeginIdx + 1;
        this.arrayBeginIdx = arrayBeginIdx;
        this.arrayEndIdx = arrayEndIdx;
    }

    public Symbol(String name, long offset, boolean iterator, boolean init)
    {
        this.name = name;
        this.offset = offset;

        isInitialized = true;
        isArray = false;
        isIterator = true;
        size = 1;
        arrayBeginIdx = 0;
        arrayEndIdx = 0;
    }

    public String getName()
    {
        return name;
    }

    public boolean isInitialized()
    {
        return isInitialized;
    }

    public void setInitialized(boolean initialized)
    {
        isInitialized = initialized;
    }

    public boolean isArray()
    {
        return isArray;
    }

    public boolean isIterator()
    {
        return isIterator;
    }

    public long getValue()
    {
        return value;
    }

    public void setValue(long value)
    {
        this.value = value;
    }

    public long getSize()
    {
        return size;
    }

    public long getArrayBeginIdx()
    {
        return arrayBeginIdx;
    }

    public long getArrayEndIdx()
    {
        return arrayEndIdx;
    }

    public long getOffset()
    {
        return offset;
    }

    public void setOffset(long offset)
    {
        this.offset = offset;
    }

}
