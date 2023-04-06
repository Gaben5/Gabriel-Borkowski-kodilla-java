package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class HealthyShop implements OrdersSuppliers{
    public HealthyShop() {
    }
    @Override
    public boolean process(Map<String, Integer> productsAvailable) {
        System.out.println("Process HS");
        return true;
    }
}
