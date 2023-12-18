package com.model.factory.simplePizzaFactory;

import com.model.factory.allPizzas.Pizza;
import com.model.factory.simplePizzaFactory.SimplePizzaFactory;

public class PizzaStore {
    //use factory to create pizzas ,create a lot of concrete class
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        //利用工厂类替代new操作符生成对象
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
