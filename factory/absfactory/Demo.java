package factory.absfactory;

class Demo
{
    public static void main(String[] args)
    {
        System.out.println("BJ:");
        new OrderPizza(new BJFactory());
        System.out.println("LD:");
        new OrderPizza(new LDFactory());
    }
}
