package com.kodilla.testing.shape;

public class Triangle implements Shape {

    protected String shapeNameTriangle;
    protected double lenghtTriangle;
    protected double heightTriangle;

    public Triangle(String shapeNameTriangle, double lenghtTriangle, double heightTriangle) {
        this.shapeNameTriangle = shapeNameTriangle;
        this.lenghtTriangle = lenghtTriangle;
        this.heightTriangle = heightTriangle;
    }

    public String getShapeName() {
        return "Shape name is triangle";
    }

    public double getField() {
        double shapeFieldTriangle = 0.5*lenghtTriangle*heightTriangle;
        return shapeFieldTriangle;
    }
}
