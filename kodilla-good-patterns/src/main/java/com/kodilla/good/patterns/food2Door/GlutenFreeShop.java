package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public class GlutenFreeShop implements OrdersSuppliers{
    @Override
    public boolean process(HashMap<String, Integer> productsOrdered) {
        System.out.println("Process GFS");
        return true;
    }
}
