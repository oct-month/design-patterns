package SevenPrinciples.SingleResponsibility;

// 违反了单一职责原则
public class Demo1
{
    public static void main(String[] args)
    {
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }
}
