package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.createTask(TaskFactory.SHOPPING_TASK);
        System.out.println("Is task executed? : " + shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();
        System.out.println("Is task executed now? : " + shoppingTask.isTaskExecuted());
        //Then
        assertEquals("ShoppingTask",shoppingTask.getTaskName());
        assertTrue(shoppingTask.isTaskExecuted());
    }
    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.createTask(TaskFactory.PAINTING_TASK);
        System.out.println("Is task executed? : " + paintingTask.isTaskExecuted());
        paintingTask.executeTask();
        System.out.println("Is task executed now? : " + paintingTask.isTaskExecuted());
        //Then
        assertEquals("PaintingTask",paintingTask.getTaskName());
        assertTrue(paintingTask.isTaskExecuted());
    }
    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.createTask(TaskFactory.DRIVING_TASK);
        System.out.println("Is task executed? : " + drivingTask.isTaskExecuted());
        drivingTask.executeTask();
        System.out.println("Is task executed now? : " + drivingTask.isTaskExecuted());
        //Then
        assertEquals("DrivingTask",drivingTask.getTaskName());
        assertTrue(drivingTask.isTaskExecuted());
    }
}
