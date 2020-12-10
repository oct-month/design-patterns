package factory.absfactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.pizza.Pizza;

class OrderPizza
{
    AbsFactory factory;

    public OrderPizza(AbsFactory factory)
    {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory)
    {
        Pizza pizza = null;
        String orderType = "";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null)
            {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            else
            {
                System.out.println("订购失败");
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
