package com.kodilla.good.patterns.food2Door;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(
                new SellServiceHealthyShop(),
                new InfServiceHealthyShop()
        );
        orderService.process(new BuyRequest(
                new HealthyShop(),
                new Product("Meat", 25),
                11
        ));
    }
}
