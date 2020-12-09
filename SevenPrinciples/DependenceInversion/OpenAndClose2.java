package SevenPrinciples.DependenceInversion;

public class OpenAndClose2 implements IOpenAndClose2
{
    private ITV tv;

    public OpenAndClose2(ITV tv)
    {
        this.tv = tv;
    }

    @Override
    public void open()
    {
        this.tv.play();
    }
}

