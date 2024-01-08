package com.model.templateMethodPattern.relations;

public class Test {

    public static void main(String[] args) {
        System.out.println("-------------dependency---------------");
        //dependency
        A a1 = new A();
        B b1 = new B();
        a1.dependencyB(b1);
        System.out.println("------------aggregation--------------");
        A a2 = new A();
        B b2 = new B();
        a2.setB(b2);
        a2.aggregationB();
        b2 = null;
        a2.aggregationB();
        System.out.println("---------------composition--------------");
        C c = new C();
        A a3 = new A(c);
        a3.compositionC();
        c = null;
        a3.compositionC();

    }
}
