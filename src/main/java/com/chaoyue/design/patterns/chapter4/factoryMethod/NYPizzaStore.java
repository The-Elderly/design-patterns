package com.chaoyue.design.patterns.chapter4.factoryMethod;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;
import com.chaoyue.design.patterns.chapter4.pizza.newyork.NYStyleCheesePizza;
import com.chaoyue.design.patterns.chapter4.pizza.newyork.NYStyleClamPizza;
import com.chaoyue.design.patterns.chapter4.pizza.newyork.NYStylePepperoniPizza;
import com.chaoyue.design.patterns.chapter4.pizza.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        return null;
    }
}
