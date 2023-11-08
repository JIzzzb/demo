package com.example.service.impl.duckImpl;

import com.example.service.duck.QuackBehaviors;

public class Quack implements QuackBehaviors {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
