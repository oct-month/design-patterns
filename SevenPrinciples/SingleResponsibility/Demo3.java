package SevenPrinciples.SingleResponsibility;

// 在方法级别上遵循单一职责原则
// 在类级别上不遵循
public class Demo3
{
    public static void main(String[] args)
    {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }
}
