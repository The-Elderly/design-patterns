package com.chaoyue.design.patterns.chapter3.condiment;

import com.chaoyue.design.patterns.chapter3.beverage.Beverage;

/**
 * 摩卡 配料实现 使用配料装饰基类（装饰着）
 * 装饰着必须能够完全代替被装饰的对象（继承 Beverage）Beverage b = new Mocha(b)
 * 装饰这还可以扩展基类功能（组合 Beverage）被装饰的 beverage 的方法添扩展处理后重写父类方法
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    public double cost() {
        return 0.2 + beverage.cost();
    }
}
