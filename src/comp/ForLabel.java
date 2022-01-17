package comp;

public class ForLabel
{
    private Variable iterator;
    private Variable start;
    private Variable end;

    ForLabel(Variable iterator, Variable start, Variable end)
    {
        this.iterator = iterator;
        this.start = start;
        this.end = end;
    }

    public Variable getIterator()
    {
        return iterator;
    }

    public Variable getStart()
    {
        return start;
    }

    public Variable getEnd()
    {
        return end;
    }


    public void setIterator(Variable it)
    {
        iterator = it;
    }

    public void setStart(Variable st)
    {
        start = st;
    }

    public void setEnd(Variable end)
    {
        this.end = end;
    }

}
