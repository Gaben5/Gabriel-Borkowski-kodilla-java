package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop implements OrdersSuppliers{
    public GlutenFreeShop() {

    }
    @Override
    public void process() {
        System.out.println("New order for GlutenFreeShop");
    }
}
