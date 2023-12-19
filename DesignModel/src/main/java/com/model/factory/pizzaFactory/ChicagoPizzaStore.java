package com.model.factory.pizzaFactory;

/**
 * concrete factory2
 */
public class ChicagoPizzaStore extends pizzaStore{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleChessPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;

    }
}
