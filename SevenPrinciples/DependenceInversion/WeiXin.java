package SevenPrinciples.DependenceInversion;

public class WeiXin implements IReceiver
{
    @Override
    public String getInfo()
    {
        return "微信消息：hello, ok";
    }
}
