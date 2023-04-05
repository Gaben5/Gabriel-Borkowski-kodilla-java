package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class Distributor {
    private final Map<String,Integer> products;

    public Distributor(String name, String address, Map<String,Integer> products) {
        this.products = products;
    }
    public Map<String,Integer> getProducts() {
        return products;
    }
}
