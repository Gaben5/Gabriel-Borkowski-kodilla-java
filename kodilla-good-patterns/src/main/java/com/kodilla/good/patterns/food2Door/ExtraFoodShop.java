package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class ExtraFoodShop implements OrdersSuppliers{
    public ExtraFoodShop() {
    }
    @Override
    public boolean process(Map<String, Integer> productsAvailable) {
        System.out.println("Process EFS");
        return true;
    }
}
