package com.kodilla.testing.shape;


import java.util.ArrayList;

public class ShapeCollector {

    protected Shape shape;
    protected int n;
    protected Shape figureGet;
    protected String shapeName;
    protected double shapeField;


    public void addFigure(Shape shape) {
        ArrayList<Shape> figure = new ArrayList<>();
        figure.add(shape);
    }

    public void removeFigure(Shape shape) {
        ArrayList<Shape> figure = new ArrayList<>();
        figure.remove(shape);
    }

    public Shape getFigure(int n) {
        ArrayList<Shape> figure = new ArrayList<>();
        figureGet = figure.get(n);
        return figureGet;
    }

    public String showFigures() {
        ArrayList<Shape> figure = new ArrayList<>();
        figureGet = figure.get(n);
        shapeName = figureGet.getShapeName();
        shapeField = figureGet.getField();
        return (shapeName + " " + shapeField);
    }
}
