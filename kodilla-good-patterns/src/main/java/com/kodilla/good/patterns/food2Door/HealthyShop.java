package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class HealthyShop implements OrdersSuppliers{
    @Override
    public boolean process(BuyRequest buyRequest, Map<String, Integer> productsAvailable) {
        System.out.println("Process HS");
        return true;
    }
}
