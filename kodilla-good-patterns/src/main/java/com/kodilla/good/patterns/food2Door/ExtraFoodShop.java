package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class ExtraFoodShop implements OrdersSuppliers{
    @Override
    public boolean process(BuyRequest buyRequest, Map<String, Integer> productsAvailable) {
        System.out.println("Process EFS");
        return true;
    }
}
