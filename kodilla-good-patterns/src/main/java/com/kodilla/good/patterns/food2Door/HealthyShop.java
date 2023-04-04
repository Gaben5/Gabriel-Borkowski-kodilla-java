package com.kodilla.good.patterns.food2Door;

public class HealthyShop implements OrdersSuppliers{
    public HealthyShop() {
    }
    @Override
    public void process() {
        System.out.println("New order for HealthyShop");
    }
}
