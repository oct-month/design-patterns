package SevenPrinciples.LiskovSubstitution;

public class B extends A
{
    @Override
    public int func1(int num1, int num2)
    {
        return num1 + num2;
    }

    public int func2(int num1, int num2)
    {
        return func1(num1, num2) + 9;
    }
}
