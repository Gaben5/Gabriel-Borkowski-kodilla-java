package com.kodilla.good.patterns.food2Door;

public class Dto {
    public OrdersSuppliers orderSuppliers;
    public boolean isAvailable;

    public Dto(final OrdersSuppliers orderSuppliers, final boolean isAvailable) {
        this.orderSuppliers = orderSuppliers;
        this.isAvailable = isAvailable;
    }

    public OrdersSuppliers getOrderSuppliers() {
        return orderSuppliers;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
