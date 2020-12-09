package SevenPrinciples.DependenceInversion;

public class Email2 implements IReceiver
{
    @Override
    public String getInfo()
    {
        return "电子邮件信息：hello, world";
    }
}
