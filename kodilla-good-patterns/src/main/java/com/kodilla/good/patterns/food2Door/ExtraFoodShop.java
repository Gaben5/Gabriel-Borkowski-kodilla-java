package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public class ExtraFoodShop implements OrdersSuppliers{
    @Override
    public boolean process(HashMap<String, Integer> productsOrdered) {
        System.out.println("Process EFS");
        return true;
    }
}
