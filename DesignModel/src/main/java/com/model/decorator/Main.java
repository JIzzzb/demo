package com.model.decorator;

import com.model.decorator.allBeverages.DarkRoast;
import com.model.decorator.allBeverages.Decaf;
import com.model.decorator.allBeverages.Espresso;
import com.model.decorator.allCondiments.Mocha;
import com.model.decorator.allCondiments.Whip;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+ " $" + beverage1.cost());
    }
}
