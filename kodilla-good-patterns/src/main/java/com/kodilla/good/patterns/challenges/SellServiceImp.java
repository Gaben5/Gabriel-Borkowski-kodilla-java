package com.kodilla.good.patterns.challenges;

public class SellServiceImp implements SellService{
    @Override
    public boolean sell(User user, Product product) {
        return product.getName().equals("Car");
    }
}
