package com.kodilla.good.patterns.food2Door;

public class BuyRequest {
    private final OrdersSuppliers ordersSuppliers;
    private final Product product;
    private final int quantity;

    public BuyRequest(OrdersSuppliers ordersSuppliers, Product product, int quantity) {
        this.ordersSuppliers = ordersSuppliers;
        this.product = product;
        this.quantity = quantity;
    }

    public OrdersSuppliers getOrdersSuppliers() {
        return ordersSuppliers;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
