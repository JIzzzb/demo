package com.example.service.duck;

public abstract class Duck {

    FlyBehaviors fly;
    QuackBehaviors quack;

    public abstract void display();

    public void performFly() {
        fly.fly();
    }

    public void performQuack() {
        quack.quack();
    }

    public void swim() {
        System.out.println("All ducks can swim");
    }

    /**
     * set 方法绑定具体behavior
     */
    public void setFly(FlyBehaviors fly) {
        this.fly = fly;
    }

    public void setQuack(QuackBehaviors quack) {
        this.quack = quack;
    }
}
