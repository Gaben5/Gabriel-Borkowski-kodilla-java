package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> productsOrdered = null;
        productsOrdered.put("Apple",10);
        productsOrdered.put("Orange",20);
        productsOrdered.put("Banana",30);

        OrderService orderService = new OrderService();
        orderService.process(new BuyRequest(
                new HealthyShop(),
                productsOrdered,
                new User("Maciek","Kielce")
        ));


    }
}
