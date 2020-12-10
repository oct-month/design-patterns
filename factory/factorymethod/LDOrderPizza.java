package factory.factorymethod;

import factory.pizza.LDCheesePizza;
import factory.pizza.LDPepperPizza;
import factory.pizza.Pizza;

class LDOrderPizza extends OrderPizza
{
    @Override
    Pizza createPizza(String orderType)
    {
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
