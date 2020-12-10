package factory.simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.pizza.Pizza;


class OrderPizza
{
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory factory)
    {
        setFactory(factory);
    }

    public void setFactory(SimpleFactory factory)
    {
        String orderType = "";
        this.simpleFactory = factory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);
            if (pizza != null)
            {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }
            else
            {
                System.out.println("订购披萨失败");
                break;
            }
        } while (true);
    }

    private String getType()
    {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza's type: ");
            String orderType = strin.readLine();
            return orderType;
        }
        catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
