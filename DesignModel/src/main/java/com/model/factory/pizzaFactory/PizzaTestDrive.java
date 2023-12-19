package com.model.factory.pizzaFactory;



public class PizzaTestDrive {
    public static void main(String[] args) {
        pizzaStore pizzaStore = new CaliforniaPizzaStore();
        Pizza cheese = pizzaStore.orderPizza("cheese");
        System.out.println(cheese.getName());
    }
}
