package com.chaoyue.design.patterns.chapter4.simpleFactory;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;


public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    @SuppressWarnings("Duplicates")
    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
