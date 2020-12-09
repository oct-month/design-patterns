package SevenPrinciples.DependenceInversion;

public class Person2
{
    public void receive(IReceiver receiver)
    {
        System.out.println(receiver.getInfo());
    }
}
