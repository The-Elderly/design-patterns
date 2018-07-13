package com.chaoyue.design.patterns.chapter1.duck;

import com.chaoyue.design.patterns.chapter1.behavior.fly.FlyBehavior;
import com.chaoyue.design.patterns.chapter1.behavior.quack.QuackBehavior;

public abstract class Duck {
    Duck() {
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("all duck can swim!!! swimming");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
