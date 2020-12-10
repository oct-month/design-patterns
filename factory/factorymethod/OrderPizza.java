package factory.factorymethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.pizza.Pizza;

abstract class OrderPizza
{
    abstract Pizza createPizza(String orderType);

    public OrderPizza()
    {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType);
            if (pizza != null)
            {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            else
            {
                break;
            }
        } while (true);
    }

    private String getType()
    {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input pizza's type: ");
            String orderType = strin.readLine();
            return orderType;
        }
        catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
