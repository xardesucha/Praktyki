public class Prostokat
{
    private int bokA;
    private int bokB;

    public Prostokat()
    {
    }

    public Prostokat(int bokA, int bokB)
    {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public int obliczPole()
    {
        return bokA * bokB;
    }

    public double obliczPrzekatna()
    {
        return Math.sqrt(bokA * bokA) + bokB * bokB;
    }

    public int getBokA()
    {
        return bokA;
    }

    public void setBokA(int bokA)
    {
        this.bokA = bokA;
    }

    public int getBokB()
    {
        return bokB;
    }

    public void setBokB(int bokB)
    {
        this.bokB = bokB;
    }
}