package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class HealthyShop implements OrdersSuppliers{
    public HealthyShop(Map<String, Integer> productsAvailable) {
    }
    @Override
    public boolean process() {
        System.out.println("Process HS");
        return true;
    }
}
