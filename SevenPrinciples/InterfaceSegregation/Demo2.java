package SevenPrinciples.InterfaceSegregation;

public class Demo2
{
    public static void main(String[] args)
    {
        A2 a = new A2();
        a.depend1(new B2());
        a.depend2(new B2());
        a.depend3(new B2());

        C2 c = new C2();
        c.depend1(new D2());
        c.depend4(new D2());
        c.depend5(new D2());
    }
}
