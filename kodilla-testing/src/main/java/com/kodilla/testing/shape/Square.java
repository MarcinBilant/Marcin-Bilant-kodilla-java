package com.kodilla.testing.shape;

public class Square implements Shape {
    protected String shapeNameSquare;
    protected double lenghtSquare;

    public Square(String shapeNameSquare, double lenghtSquare) {
        this.shapeNameSquare = shapeNameSquare;
        this.lenghtSquare = lenghtSquare;
    }

    public String getShapeName() {
        return "Shape name is square";
    }

    public double getField() {
        double shapeFieldSquare = lenghtSquare*lenghtSquare;
        return shapeFieldSquare;
    }
}
