package SevenPrinciples.DependenceInversion;

public class OpenAndClose implements IOpenAndClose
{
    @Override
    public void open(ITV tv)
    {
        tv.play();
    }
}
