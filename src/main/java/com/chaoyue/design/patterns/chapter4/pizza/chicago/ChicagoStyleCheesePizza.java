package com.chaoyue.design.patterns.chapter4.pizza.chicago;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
