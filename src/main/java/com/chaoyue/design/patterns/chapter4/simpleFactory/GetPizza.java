package com.chaoyue.design.patterns.chapter4.simpleFactory;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;

public class GetPizza {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.getName());
    }
}
