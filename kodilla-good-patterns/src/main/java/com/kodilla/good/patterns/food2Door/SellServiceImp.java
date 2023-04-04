package com.kodilla.good.patterns.food2Door;

public class SellServiceImp implements SellService{
    @Override
    public boolean sell(Supplier supplier, Product product, int quantity) {
        return product.getName().equals("Meat") && quantity <= 10;
    }
}
