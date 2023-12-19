package com.model.factory.pizzaFactory;

/**
 * concrete factory1
 */
public class CaliforniaPizzaStore extends pizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new CaliforniaStyleCheesePizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            case "peperoni":
                pizza = new Peperoni();
                break;
        }
        return pizza;
    }
}
