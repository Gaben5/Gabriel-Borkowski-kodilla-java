package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public class BuyRequest {
    private final OrdersSuppliers ordersSuppliers;
    private final HashMap<String, Integer> productsOrdered;
    public BuyRequest(OrdersSuppliers ordersSuppliers, HashMap<String, Integer> productsOrdered, User user) {
        this.ordersSuppliers = ordersSuppliers;
        this.productsOrdered = productsOrdered;
    }
    public OrdersSuppliers getOrdersSuppliers() {
        return ordersSuppliers;
    }

    public HashMap<String, Integer> getProductsOrdered() {
        return productsOrdered;
    }
}
