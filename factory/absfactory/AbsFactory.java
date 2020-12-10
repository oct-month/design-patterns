package factory.absfactory;

import factory.pizza.Pizza;

interface AbsFactory
{
    public Pizza createPizza(String orderType);
}
