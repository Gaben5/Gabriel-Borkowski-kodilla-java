package com.kodilla.good.patterns.food2Door;

public class SellServiceHealthyShop implements SellService{
    @Override
    public boolean sell(OrdersSuppliers ordersSuppliers, Product product, int quantity) {
        return product.getName().equals("Meat") && quantity <= 10;
    }
}
