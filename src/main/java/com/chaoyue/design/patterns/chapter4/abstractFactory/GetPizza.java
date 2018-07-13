package com.chaoyue.design.patterns.chapter4.abstractFactory;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;

/**
 * 抽象工厂模式 Abstract Factory Pattern
 * 提供一个接口，用户创建相关或依赖对象的家族，而不需要明确指定具体类
 * demo 说明
 * PizzaIngredientFactory 就是使用了抽象工厂模式，传入抽象工厂给对应的Pizza子类，子类不关心具体工厂实现类，只需要调用工厂的创建方法
 * 而整体的pizzaStore使用的工厂方法模式（参考factoryMethod 中的说明）
 * <p>
 * 抽象工厂与工厂方法的区别
 * 抽象工厂使用组合（NYPizzaStore 中包含 PizzaIngredientFactory ）工厂方法使用继承（NYPizzaStore 继承 PizzaStore）
 */
public class GetPizza {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(pizza);
    }
}
