package com.kodilla.testing.shape;

public class Circle implements Shape {

    protected String shapeNameCircle;
    protected double radius;

    public Circle(String shapeNameCircle, double radius) {
        this.shapeNameCircle = shapeNameCircle;
        this.radius = radius;
    }

    public String getShapeName() {
        return "Shape name is circle";
    }

    public double getField() {
        double shapeFieldCircle = 3.14 * radius;
        return shapeFieldCircle;
    }
}
