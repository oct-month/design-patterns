package factory.factorymethod;

import factory.pizza.BJCheesePizza;
import factory.pizza.BJPepperPizza;
import factory.pizza.Pizza;

class BJOrderPizza extends OrderPizza
{
    @Override
    Pizza createPizza(String orderType) {
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
