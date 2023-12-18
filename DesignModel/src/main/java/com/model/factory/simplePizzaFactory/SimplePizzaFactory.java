package com.model.factory.simplePizzaFactory;

import com.model.factory.allPizzas.*;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("peperoni")) {
            pizza = new Peperoni();
        }
        return pizza;
    }
}
