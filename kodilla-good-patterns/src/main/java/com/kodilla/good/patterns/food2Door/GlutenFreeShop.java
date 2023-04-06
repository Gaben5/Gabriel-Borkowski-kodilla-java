package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class GlutenFreeShop implements OrdersSuppliers{
    public GlutenFreeShop() {
    }
    @Override
    public boolean process(Map<String, Integer> productsAvailable) {
        System.out.println("Process GFS");
        return true;
    }
}
