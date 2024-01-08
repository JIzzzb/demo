package com.model.templateMethodPattern.relations;

public class A {

    //dependency
    public void dependencyB(B b1) {
        System.out.println("dependency " + b1);
    }

    //aggregation
    B b;

    // if B disappear A cant disappear;
    public void setB(B b) {
        this.b = b;
    }

    public void aggregationB() {
        if (b == null) System.out.println("null");
        System.out.println("aggregation " + this.b);
    }


    //composition
    //if c disappear A?
    C c;

    public A(C c) {
        this.c = c;
    }

    public void compositionC() {
        if (c == null) System.out.println("null");
        System.out.println("composition" + c);
    }

    public A() {
    }

}
