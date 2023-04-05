package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class GlutenFreeShop implements OrdersSuppliers{
    @Override
    public boolean process(BuyRequest buyRequest, Map<String, Integer> productsAvailable) {
        System.out.println("Process GFS");
        return true;
    }
}
