package com.chaoyue.design.patterns.chapter8.version1;

class Tea extends CaffeineBeverage {

    @Override
    void brew() {
        System.out.println("brew Tea");
    }

    @Override
    void addCondiments() {
        System.out.println("addCondiments for Tea");
    }

}
