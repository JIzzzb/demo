package com.model.templateMethodPattern;

public class Tea extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping tea bag");
    }

}
