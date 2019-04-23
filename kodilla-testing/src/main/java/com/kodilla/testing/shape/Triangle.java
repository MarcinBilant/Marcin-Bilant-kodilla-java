package com.kodilla.testing.shape;

public class Triangle implements Shape {

    protected String shapeNameTriangle;
    protected String shapeFieldTriangle;

    public Triangle(String shapeNameTriangle, String shapeFieldTriangle) {
        this.shapeNameTriangle = shapeNameTriangle;
        this.shapeFieldTriangle = shapeFieldTriangle;
    }

    public String getShapeName() {
        return "Shape name is triangle";
    }

    public String getField() {
        return "Triangle field is 20 cm2";
    }
}
