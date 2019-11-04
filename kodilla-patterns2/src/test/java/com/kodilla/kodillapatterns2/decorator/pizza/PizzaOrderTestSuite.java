package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15.00), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetdescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza standard ingredients: dough, tomato sauce, cheese", description);

    }
    @Test
    public void testCapricosaPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CapricosaPizza(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(27.00), calculatedCost);
    }

    @Test
    public void testCapricosaPizzaOrderGetdescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CapricosaPizza(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza standard ingredients: dough, tomato sauce, cheese + mushrooms + ham", description);

    }
    @Test
    public void testFunghiAddCheesePizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FunghiPizza(theOrder);
        theOrder = new AddCheeseDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24.00), calculatedCost);
    }

    @Test
    public void testFunghiAddCheesePizzaOrderGetdescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new FunghiPizza(theOrder);
        theOrder = new AddCheeseDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Pizza standard ingredients: dough, tomato sauce, cheese + mushrooms + cheese", description);

    }
}
