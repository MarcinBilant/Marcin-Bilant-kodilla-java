package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class FunghiPizza extends AbstractPizzaOrderDecorator {
    public FunghiPizza (PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }
    @Override
    public String getDescription() {
        return super.getDescription() + " + mushrooms";
    }
}
