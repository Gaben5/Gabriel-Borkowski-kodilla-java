package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class BuyRequest {
    private final OrdersSuppliers ordersSuppliers;
    private final Map<String, Integer> productsOrdered;
    public BuyRequest(OrdersSuppliers ordersSuppliers, Map<String, Integer> productsOrdered, User user) {
        this.ordersSuppliers = ordersSuppliers;
        this.productsOrdered = productsOrdered;
    }
    public OrdersSuppliers getOrdersSuppliers() {
        return ordersSuppliers;
    }

    public Map<String, Integer> getProductsOrdered() {
        return productsOrdered;
    }
}
