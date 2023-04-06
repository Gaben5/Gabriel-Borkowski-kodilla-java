package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class GlutenFreeShop implements OrdersSuppliers{
    public GlutenFreeShop() {
    }
    @Override
    public boolean process() {
        System.out.println("Process GFS");
        return true;
    }
}
