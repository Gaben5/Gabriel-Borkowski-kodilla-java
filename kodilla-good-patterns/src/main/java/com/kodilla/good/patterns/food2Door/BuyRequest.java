package com.kodilla.good.patterns.food2Door;

public class BuyRequest {
    private final Supplier supplier;
    private final Product product;
    private final int quantity;

    public BuyRequest(Supplier supplier, Product product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }
    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
