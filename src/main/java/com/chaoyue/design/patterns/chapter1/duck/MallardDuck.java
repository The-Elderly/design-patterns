package com.chaoyue.design.patterns.chapter1.duck;

import com.chaoyue.design.patterns.chapter1.behavior.fly.FlyWithWings;
import com.chaoyue.design.patterns.chapter1.behavior.quack.Quack;

public class MallardDuck extends Duck {


    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
