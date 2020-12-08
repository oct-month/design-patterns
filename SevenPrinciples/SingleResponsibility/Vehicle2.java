package SevenPrinciples.SingleResponsibility;

public class Vehicle2
{
    public void run(String vehicle)
    {
        System.out.println(vehicle + "在公路上运行...");
    }

    public void runAir(String vehicle)
    {
        System.out.println(vehicle + "在天空中运行...");
    }

    public void runWater(String vehicle)
    {
        System.out.println(vehicle + "在水中运行...");
    }
}
