package com.kodilla.good.patterns.food2Door;

public class Supplier {
    private String name;
    private int tax;

    public Supplier(String name, int tax) {
        this.name = name;
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    public String getName() {
        return name;
    }
}
