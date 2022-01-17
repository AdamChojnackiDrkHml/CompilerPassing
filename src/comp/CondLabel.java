package comp;

public class CondLabel
{
    private final long startPointer;
    private final long goToPointer;

    public CondLabel(long start, long goTo)
    {
        startPointer = start;
        goToPointer = goTo;
    }

    public long getStartPointer()
    {
        return startPointer;
    }

    public long getGoToPointer()
    {
        return goToPointer;
    }
}
