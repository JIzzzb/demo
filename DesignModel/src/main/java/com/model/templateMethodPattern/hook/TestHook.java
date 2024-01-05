package com.model.templateMethodPattern.hook;

public class TestHook {
    public static void main(String[] args) {
        CoffeeWithHook hook1 = new CoffeeWithHook();
        hook1.prepare();
        System.out.println("----------------------");
        TeaWithHook teaWithHook = new TeaWithHook();
        teaWithHook.prepare();

    }
}
