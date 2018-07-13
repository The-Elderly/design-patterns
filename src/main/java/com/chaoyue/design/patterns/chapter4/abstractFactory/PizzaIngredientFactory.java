package com.chaoyue.design.patterns.chapter4.abstractFactory;

import com.chaoyue.design.patterns.chapter4.ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();

}
