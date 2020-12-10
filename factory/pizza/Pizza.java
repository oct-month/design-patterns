package factory.pizza;

public class Pizza
{
    private String name;

    public void prepare()
    {
        System.out.println(name + " pizza prepare.");
    }

    public void bake()
    {
        System.out.println(name + " pizza bake.");
    }

    public void cut()
    {
        System.out.println(name + " pizza cut.");
    }

    public void box()
    {
        System.out.println(name + " pizza box.");
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
