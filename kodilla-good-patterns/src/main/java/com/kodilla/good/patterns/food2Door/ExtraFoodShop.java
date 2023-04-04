package com.kodilla.good.patterns.food2Door;

public abstract class ExtraFoodShop implements OrdersSuppliers{
    public ExtraFoodShop() {

    }
    @Override
    public void process() {
        System.out.println("New order for ExtraFoodShop");
    }
}
