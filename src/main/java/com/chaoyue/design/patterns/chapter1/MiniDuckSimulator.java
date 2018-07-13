package com.chaoyue.design.patterns.chapter1;

import com.chaoyue.design.patterns.chapter1.behavior.fly.FlyRocketPowered;
import com.chaoyue.design.patterns.chapter1.duck.Duck;
import com.chaoyue.design.patterns.chapter1.duck.MallardDuck;
import com.chaoyue.design.patterns.chapter1.duck.ModelDuck;

/**
 * 策略模式 Strategy Pattern
 * 定义了算法族，分别封装起来，让他们之间可以相互替换，此模式让算法的变化独立于使用算法的客户
 * <p>
 * demo 说明
 * FlyBehavior 和 QuackBehavior 以及他们的实现类就是定义的算法族。
 * Duck只接受接口层的FlyBehavior和QuackBehavior 而不关心其底层实现 面向接口编程
 */

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("--- now this's a new duck ---");
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
        System.out.println("--- rocket !!! ---");
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
