package com.model.templateMethodPattern.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getInput();
        return answer.equalsIgnoreCase("y");
    }

    public String getInput() {
        String answer = null ;
        System.out.println("would you like some condiments(y/n)");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException e){
            System.out.println("IO error trying to read your answer");
        }
        if (answer == null){
           return "y";
        }
        return answer;
    }
}
