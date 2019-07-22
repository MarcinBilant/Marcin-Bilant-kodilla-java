package com.kodilla.patterns.singleton.factory.task;

import com.kodilla.patterns.factory.task.ShoppingTask;
import com.kodilla.patterns.factory.task.Task;
import com.kodilla.patterns.factory.task.TaskFactory;
import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        ShoppingTask shopping = (ShoppingTask)factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        Assert.assertEquals("Shopping",shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painnting = factory.makeTask(TaskFactory.PAINTING);
        painnting.executeTask();
        //Then
        Assert.assertEquals("Painting",painnting.getTaskName());
        Assert.assertTrue(painnting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("Driving",driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
