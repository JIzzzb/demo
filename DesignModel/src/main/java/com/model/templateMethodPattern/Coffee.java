package com.model.templateMethodPattern;

public class Coffee extends CaffeineBeverage{

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}
