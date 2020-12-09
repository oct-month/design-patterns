package SevenPrinciples.DependenceInversion;

// Person2依赖抽象的IReceiver接口
public class Demo2
{
    public static void main(String[] args)
    {
        Person2 person = new Person2();
        person.receive(new Email2());
        person.receive(new WeiXin());
    }
}
