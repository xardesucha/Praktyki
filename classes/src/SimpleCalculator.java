public class SimpleCalculator
{
    public double add(double numOne, double numTwo)
    {
        return numOne + numTwo;
    }

    public double difference(double numOne, double numTwo)
    {
        return numOne - numTwo;
    }

    public double multiply(double numOne, double numTwo)
    {
        return numOne * numTwo;
    }

    public double divide(double numOne, double numTwo)
    {
        if (numTwo == 0 )
        {
            System.out.println("Nie można dzielić przez zero.");
            return 0;
        }
        return numOne / numTwo;
    }
}