package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String color;
    private final String whatToPaint;
    boolean isExecutedTask;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.isExecutedTask = false;
    }

    @Override
    public void executeTask() {
        System.out.println("Executing painting task");
        isExecutedTask = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecutedTask;
    }
}
