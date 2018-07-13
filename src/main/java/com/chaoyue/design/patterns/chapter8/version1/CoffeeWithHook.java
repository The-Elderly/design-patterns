package com.chaoyue.design.patterns.chapter8.version1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("brew Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("addCondiments for Coffee");
    }

    boolean customerWantsCondiments() {
        String answer = getUserInput();
        return answer.toUpperCase().equals("Y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to and some Condiments? {y/n}");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = bufferedReader.readLine();
        } catch (IOException e) {
            System.err.println("IO error trying to read your answer");
        }
        if (answer == null) {
            return "N";
        }
        return answer;
    }
}
