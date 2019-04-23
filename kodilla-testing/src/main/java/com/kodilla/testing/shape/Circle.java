package com.kodilla.testing.shape;

public class Circle implements Shape {

    protected String shapeNameCircle;
    protected String shapeFieldCircle;

    public Circle(String shapeNameCircle, String shapeFieldCircle) {
        this.shapeNameCircle = shapeNameCircle;
        this.shapeFieldCircle = shapeFieldCircle;
    }

    public String getShapeName() {
        return "Shape name is circle";
    }

    public String getField() {
        return "Circle field is 25 cm2 ";
    }
}
