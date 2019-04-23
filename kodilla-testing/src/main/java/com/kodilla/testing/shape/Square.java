package com.kodilla.testing.shape;

public class Square implements Shape {
    protected String shapeNameSquare;
    protected String shapeFieldSquare;

    public Square(String shapeNameSquare, String shapeFieldSquare) {
        this.shapeNameSquare = shapeNameSquare;
        this.shapeFieldSquare = shapeFieldSquare;
    }

    public String getShapeName() {
        return "Shape name is square";
    }

    public String getField() {
        return "Square field is 16 cm2 ";
    }
}
