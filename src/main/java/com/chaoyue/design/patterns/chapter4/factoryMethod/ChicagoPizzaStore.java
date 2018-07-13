package com.chaoyue.design.patterns.chapter4.factoryMethod;

import com.chaoyue.design.patterns.chapter4.pizza.Pizza;
import com.chaoyue.design.patterns.chapter4.pizza.chicago.ChicagoStyleCheesePizza;
import com.chaoyue.design.patterns.chapter4.pizza.chicago.ChicagoStyleClamPizza;
import com.chaoyue.design.patterns.chapter4.pizza.chicago.ChicagoStylePepperoniPizza;
import com.chaoyue.design.patterns.chapter4.pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        return null;
    }
}
