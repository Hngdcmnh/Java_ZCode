class Pair<T extends Number ,S extends Number >{
    private T first;
    private S second;

    public Pair(T first, S second)
    {
        this.first = first;
        this.second =second;
    }

    public boolean isPrime()
    {
        if(first.intValue() <2 || second.intValue()<2)
        {
            return false;
        }
        for(int i=2;i<=Math.sqrt(first.intValue());i++)
        {
            if(first.intValue()%i==0)
            {
                return false;
            }
        }
        for(int i=2;i<=Math.sqrt(second.intValue());i++)
        {
            if(second.intValue()%i==0)
            {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString()
    {
        return first +" "+ second;
    }

    public T getFirst()
    {
        return first;
    }

    public  S getSecond()
    {
        return second;
    }
}



