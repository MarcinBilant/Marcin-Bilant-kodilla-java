package com.kodilla.testing.shape;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public void removeFigure(Shape shape) {
        figures.remove(shape);
    }

    public Shape getFigure(int n) {
        return figures.get(n);
    }

    public void showFigures() {
        for (Shape figure : figures) {
            System.out.println(figure.getShapeName() + " ma pole :" + figure.getField());
        }
    }
}
