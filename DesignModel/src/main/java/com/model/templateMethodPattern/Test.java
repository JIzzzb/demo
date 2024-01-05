package com.model.templateMethodPattern;

public class Test {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepare();
        System.out.println("---------------------------");
        Coffee coffee = new Coffee();
        coffee.prepare();
    }
}
