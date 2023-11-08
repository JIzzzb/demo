package com.example.service.duck;

import com.example.service.impl.duckImpl.FlyWithWings;
import com.example.service.impl.duckImpl.Quack;
import com.example.service.impl.duckImpl.Squeak;

public class MallardDuck extends Duck {
    /**
     * 构造器绑定
     */
    public MallardDuck() {
//        fly = new FlyWithWings();
//        quack = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I`m black");
    }
}
