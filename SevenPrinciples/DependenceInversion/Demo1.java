package SevenPrinciples.DependenceInversion;

// Person与具体的Email产生依赖
public class Demo1
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.receive(new Email());
    }
}