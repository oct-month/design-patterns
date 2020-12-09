package SevenPrinciples.DependenceInversion;

public class Person
{
    public void receive(Email email)
    {
        System.out.println(email.getInfo());
    }
}
