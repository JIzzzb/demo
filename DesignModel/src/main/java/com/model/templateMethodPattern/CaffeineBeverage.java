package com.model.templateMethodPattern;

public abstract class CaffeineBeverage {
    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void addCondiments();

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public abstract void brew();

    public void boilWater() {
        System.out.println("Boiling water");
    }
}
