package com.chaoyue.design.patterns.chapter4.factoryMethod;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;

/**
 * 工厂方法模式 Factory Method Pattern
 * 定义一个创建对象的接口 由子类决定要实例化的类是哪一个
 * 工厂方法让类把实例化推迟到子类
 * demo 说明
 * NYStore 和 ChicagoStore 是PizzaStore的实现类 使用时只需要根据需要选用相应子类的工厂方法创建示例即可
 */

public class GetPizza {
    public static void main(String[] args) {
        System.out.println("I'm from NY");
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza nyPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println(nyPizza.getName());
        System.out.println("I'm from chicago");
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("veggie");
        System.out.println(chicagoPizza.getName());
    }
}
