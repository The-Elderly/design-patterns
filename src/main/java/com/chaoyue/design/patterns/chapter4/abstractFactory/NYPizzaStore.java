package com.chaoyue.design.patterns.chapter4.abstractFactory;


import com.chaoyue.design.patterns.chapter4.pizza.*;

public class NYPizzaStore extends PizzaStore {
    private Pizza pizza = null;
    private PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
