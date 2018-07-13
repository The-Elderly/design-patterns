package com.chaoyue.design.patterns.chapter4.factoryMethod;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;

/**
 * 工厂方法
 */
public abstract class PizzaStore {

    @SuppressWarnings("Duplicates")
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    abstract Pizza createPizza(String type);
}
