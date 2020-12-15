package adapter.classadapter;

class Demo
{
    public static void main(String[] args)
    {
        System.out.println("====类适配器模式====");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
