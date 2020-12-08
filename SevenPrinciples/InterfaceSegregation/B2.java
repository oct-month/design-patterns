package SevenPrinciples.InterfaceSegregation;

public class B2 implements Interface21, Interface223
{
    @Override
    public void operation1()
    {
        System.out.println("B2 实现 operation1");
    }

    @Override
    public void operation2()
    {
        System.out.println("B2 实现 operation2");
    }

    @Override
    public void operation3()
    {
        System.out.println("B2 实现 operation3");
    }
}