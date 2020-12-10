package factory.absfactory;

import factory.pizza.BJCheesePizza;
import factory.pizza.BJPepperPizza;
import factory.pizza.Pizza;

class BJFactory implements AbsFactory
{
    @Override
    public Pizza createPizza(String orderType)
    {
        System.out.println("~使用的是抽象工厂模式~");
        Pizza pizza = null;
        if (orderType.equals("cheese"))
        {
            pizza = new BJCheesePizza();
            pizza.setName("BJ cheese");
        }
        else if (orderType.equals("pepper"))
        {
            pizza = new BJPepperPizza();
            pizza.setName("BJ pepper");
        }
        return pizza;
    }
}
