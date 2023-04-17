package com.kodilla.patterns.factory.tasks;

import java.security.PublicKey;

public class TaskFactory {
    public static final String SHOPPING_TASK = "SHOPPING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task createTask(String taskClass){
        return switch (taskClass){
            case  SHOPPING_TASK -> new ShoppingTask("ShoppingTask", "T-shirt", 5);
            case PAINTING_TASK -> new PaintingTask("PaintingTask", "blue", "sky");
            case DRIVING_TASK -> new DrivingTask("DrivingTask", "Warsaw", "Car");
            default -> null;
        };
    }
}
