package com.kodilla.patterns.factory.task;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "laptop",1.0);
            case PAINTING:
                return new PaintingTask("Painting", "white", "ceiling");
            case DRIVING:
                return new DrivingTask("Driving", "to work", "by car");
            default:
                return null;
        }
    }

}
