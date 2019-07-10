package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //when
        double add = calculator.add(10, 5);
        double sub = calculator.sub(15, 8);
        double mul = calculator.mul(4, 5);
        double div = calculator.div(40, 8);

        //then
        Assert.assertEquals(15, add, 0);
        Assert.assertEquals(7, sub, 0);
        Assert.assertEquals(20, mul, 0);
        Assert.assertEquals(5, div, 0);
    }

}
