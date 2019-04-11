package com.kodilla.testing;

import com.kodilla.testing.User.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator myCalculator = new Calculator(30, 12);
        int a = myCalculator.getA();
        int b = myCalculator.getB();
        int resultAddingAToB = myCalculator.addingAToB(a, b);
        int resultSubstractAFronB = myCalculator.substractAFronB(a, b);
        System.out.println("Result adding A to B equals: " + resultAddingAToB);
        System.out.println("Result substract A from B equals: " + resultSubstractAFronB);

        if (resultAddingAToB == 42) {
            System.out.println("Adding test is ok");
        } else {
            System.out.println("Adding test is wrong");
        }

        if (resultSubstractAFronB == 20) {
            System.out.println("Substraction test is ok");
        } else {
            System.out.println("Substraction test is wrong");
        }
    }
}
