package com.chaoyue.design.patterns.chapter4.pizza;

import com.chaoyue.design.patterns.chapter4.abstractFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }

    private void prepare() {
        System.out.println("Prepare " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClams();
    }
}