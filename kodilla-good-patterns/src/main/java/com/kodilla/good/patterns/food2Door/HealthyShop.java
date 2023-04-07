package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public class HealthyShop implements OrdersSuppliers{
    public HealthyShop(HashMap<String, Integer> productsAvailable) {
    }
    @Override
    public boolean process(HashMap<String, Integer> productsOrdered) {
        System.out.println("Process HS");
        return true;
    }
}
