package com.kodilla.testing.calculator;

public class Calculator {
    private int a;
    private int b;

    public Calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int addingAToB (int a, int b) {
        return a+b;
    }

    public int substractAFronB(int a, int b) {
        return a-b;
    }
}
