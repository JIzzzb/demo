package com.example.service.impl.duckImpl;

import com.example.service.duck.FlyBehaviors;

public class FlyNoWay implements FlyBehaviors {

    @Override
    public void fly() {
        System.out.println("I`can not fly");
    }
}
