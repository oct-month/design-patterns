package SevenPrinciples.InterfaceSegregation;

public class A2
{
    public void depend1(Interface21 i)
    {
        i.operation1();
    }

    public void depend2(Interface223 i)
    {
        i.operation2();
    }

    public void depend3(Interface223 i)
    {
        i.operation3();
    }
}