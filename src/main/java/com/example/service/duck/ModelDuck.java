package com.example.service.duck;

import com.example.service.impl.duckImpl.FlyNoWay;
import com.example.service.impl.duckImpl.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        fly = new FlyNoWay();
        quack = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I`m a model duck!");
    }
}
