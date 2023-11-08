package com.example.service.duck;

import com.example.service.impl.duckImpl.FlyRocketPowered;
import com.example.service.impl.duckImpl.FlyWithWings;
import com.example.service.impl.duckImpl.Quack;

public class Main {
    public static void main(String[] args) {
//        Duck duck = new MallardDuck();
//        duck.setFly(new FlyWithWings());
//        duck.setQuack(new Quack());
//        duck.performFly();
//        duck.performQuack();
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.setFly(new FlyRocketPowered());
        duck.performFly();
        duck.performQuack();
    }
}
