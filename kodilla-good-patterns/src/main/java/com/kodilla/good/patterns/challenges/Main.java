package com.kodilla.good.patterns.challenges;

public class Main {
    public static void main(String[] args) {
        ProductOrderService orderService = new ProductOrderService(
                new InformationServiceImp(),
                new SellServiceImp(),
                new SellRepositoryImp());
        orderService.process(new BuyRequest(
                new User("Stefan","Żeromski"),
                new Product("Car", 25000)));
    }
}
