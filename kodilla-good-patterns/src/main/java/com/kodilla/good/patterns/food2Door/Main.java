package com.kodilla.good.patterns.food2Door;

public class Main {
    public static void main(String[] args) {
        OrderService orderService = new OrderService(
                new SellServiceImp(),
                new InfServiceImp()
        );
        orderService.process(new BuyRequest(
                new Supplier("Maciek", 12345678),
                new Product("Meat", 25),
                5
        ));
    }
}
