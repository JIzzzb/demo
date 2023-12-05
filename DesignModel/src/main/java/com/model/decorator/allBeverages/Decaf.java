package com.model.decorator.allBeverages;

import com.model.decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0;
    }
}
