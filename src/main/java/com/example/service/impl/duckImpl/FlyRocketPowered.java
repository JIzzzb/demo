package com.example.service.impl.duckImpl;

import com.example.service.duck.FlyBehaviors;

public class FlyRocketPowered implements FlyBehaviors {
    @Override
    public void fly() {
        System.out.println("I`m flying with a rocket!!");
    }
}
