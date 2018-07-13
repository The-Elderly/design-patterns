package com.chaoyue.design.patterns.chapter3.condiment;

import com.chaoyue.design.patterns.chapter3.beverage.Beverage;

/**
 * 奶油 配料实现 同 Mocha
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    public double cost() {
        return 0.2 + beverage.cost();
    }
}
