package com.chaoyue.design.patterns.chapter3;

import com.chaoyue.design.patterns.chapter3.beverage.Beverage;
import com.chaoyue.design.patterns.chapter3.beverage.Espresso;
import com.chaoyue.design.patterns.chapter3.beverage.HouseBlend;
import com.chaoyue.design.patterns.chapter3.condiment.Mocha;
import com.chaoyue.design.patterns.chapter3.condiment.Soy;
import com.chaoyue.design.patterns.chapter3.condiment.Whip;

/**
 * 装饰着模式 Decorator Pattern
 * 动态的将责任附加到对象上
 * 若需要扩展功能，装饰着模式提供了比继承更有弹性的替代方案
 * 装饰着可以在所委托被装饰者的行为之前/之后，加上自己的行为，以达到特定的目的
 * CondimentDecorator 作为装饰着可以完全替代 Beverage
 * 装饰着模式就是继承和组合的符合使用的例子
 */
public class StarbucksCoffee {
    public static void main(String[] args) {
        // 来一杯浓缩咖啡（没有添加任何装饰）
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " cost : " + beverage.cost());
        // 来一杯浓缩咖啡 加双份摩卡 一份奶泡
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " cost : " + beverage1.cost());
        // 来一杯混合咖啡 配料全加
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " cost : " + beverage2.cost());
        // 单点一份奶泡？
        Whip whipOnly = new Whip(new Beverage() {
            @Override
            public double cost() {
                return 0;
            }
        });
        System.out.println(whipOnly.getDescription() + " cost : " + whipOnly.cost());
    }
}
