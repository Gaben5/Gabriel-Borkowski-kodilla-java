package com.kodilla.testing.shape;

public class Triangle implements Shape{
    private String name;
    private double field;

    public Triangle(String name, double field) {
        this.name = name;
        this.field = field;
    }

    @Override
    public String getShapeName() {
        return name;
    }
    @Override
    public double getField() {
        return field;
    }
}
