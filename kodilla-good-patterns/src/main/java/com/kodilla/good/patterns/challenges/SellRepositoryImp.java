package com.kodilla.good.patterns.challenges;

public class SellRepositoryImp implements SellRepository{
    @Override
    public void createSale(User user, Product product) {
        System.out.println("Product has been sold");
    }
}
