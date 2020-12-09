package SevenPrinciples.DependenceInversion;

public class Demo3
{
    public static void main(String[] args)
    {
        // 接口传递依赖
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(changHong);

        // 通过构造方法传递依赖
        OpenAndClose2 openAndClose2 = new OpenAndClose2(changHong);
        openAndClose2.open();

        // 通过setter方法传递依赖
        OpenAndClose3 openAndClose3 = new OpenAndClose3();
        openAndClose3.setTv(changHong);
        openAndClose3.open();
    }
}
