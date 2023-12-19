package com.model.factory.pizzaFactory;

/**
 * pizzaStore is a classic factory.
 * factory uses extends to create class object
 */
public abstract class pizzaStore {
    //move factory class to this method
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type) {
        Pizza pizza;
        //利用工厂类替代new操作符生成对象
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
