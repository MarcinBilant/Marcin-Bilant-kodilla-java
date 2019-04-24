package com.kodilla.testing.shape;

import org.junit.*;

import java.util.ArrayList;

public class ShapeCollectorTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Test
    public void testAddFigure(){
        //Given
        Shape square = new Square("Shape name is square",3);
        Shape triangle = new Triangle("Shape name is triangle", 2, 4);
        Shape circle = new Circle("Shape name is circle",2.50);

        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        Shape result1 = shapeCollector.getFigure(0);
        Shape result2 = shapeCollector.getFigure(1);
        Shape result3 = shapeCollector.getFigure(2);


        //Then
        Assert.assertEquals(square, result1);
        Assert.assertEquals(triangle, result2);
        Assert.assertEquals(circle, result3);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape square = new Square("Shape name is square",3);
        Shape triangle = new Triangle("Shape name is triangle", 2,4);
        Shape circle = new Circle("Shape name is circle",2.50);

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //When
        shapeCollector.removeFigure(square);
        shapeCollector.removeFigure(triangle);
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(0, shapeCollector.getFigure(0));
        Assert.assertEquals(0, shapeCollector.getFigure(1));
        Assert.assertEquals(0, shapeCollector.getFigure(2));

    }

    @Test
    public void testGetFigure() {
        //Given
        Shape square = new Square("Shape name is square",3);
        Shape triangle = new Triangle("Shape name is triangle", 2,4);
        Shape circle = new Circle("Shape name is circle",2.50);

        ShapeCollector shapeCollector = new ShapeCollector();

        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);

        //When
        Shape result1 = shapeCollector.getFigure(0);
        Shape result2 = shapeCollector.getFigure(1);
        Shape result3 = shapeCollector.getFigure(2);

        //Then
        Assert.assertEquals(square, result1);
        Assert.assertEquals(triangle, result2);
        Assert.assertEquals(circle, result3);

    }


}
