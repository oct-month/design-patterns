package SevenPrinciples.DependenceInversion;

public class OpenAndClose3 implements IOpenAndClose2
{
    private ITV tv;

    public void setTv(ITV tv)
    {
        this.tv = tv;
    }

    @Override
    public void open()
    {
        this.tv.play();    
    }
}
