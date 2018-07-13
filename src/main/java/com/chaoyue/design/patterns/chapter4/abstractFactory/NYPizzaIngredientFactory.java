package com.chaoyue.design.patterns.chapter4.abstractFactory;

import com.chaoyue.design.patterns.chapter4.ingredient.*;
import com.chaoyue.design.patterns.chapter4.ingredient.newyork.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new NYVeggies(), new NYVeggies()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPepperoni();
    }

    @Override
    public Clams createClams() {
        return new NYClams();
    }
}
