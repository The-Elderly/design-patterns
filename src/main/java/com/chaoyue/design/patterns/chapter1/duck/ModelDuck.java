package com.chaoyue.design.patterns.chapter1.duck;

import com.chaoyue.design.patterns.chapter1.behavior.fly.FlyNoWay;
import com.chaoyue.design.patterns.chapter1.behavior.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
