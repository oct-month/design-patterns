package factory.absfactory;

import factory.pizza.LDCheesePizza;
import factory.pizza.LDPepperPizza;
import factory.pizza.Pizza;

class LDFactory implements AbsFactory
{
    @Override
    public Pizza createPizza(String orderType)
    {
        System.out.println("~使用抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese"))
        {
            pizza = new LDCheesePizza();
            pizza.setName("LD cheese");
        }
        else if (orderType.equals("pepper"))
        {
            pizza = new LDPepperPizza();
            pizza.setName("LD pepper");
        }
        return pizza;
    }
}
