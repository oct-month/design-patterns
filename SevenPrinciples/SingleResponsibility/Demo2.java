package SevenPrinciples.SingleResponsibility;

// 遵守单一职责原则
// 但是改动很大
public class Demo2
{
    public static void main(String[] args)
    {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}
