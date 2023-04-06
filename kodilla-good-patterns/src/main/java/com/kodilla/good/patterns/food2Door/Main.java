package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> productsOrdered = null;
        productsOrdered.put("Apple",10);
        productsOrdered.put("Orange",20);
        productsOrdered.put("Banana",30);
        Map<String,Integer> productsAvailable = null;
        productsOrdered.put("Apple",5);
        productsOrdered.put("Orange",10);
        productsOrdered.put("Banana",15);

        OrderService orderService = new OrderService();

        orderService.process(new BuyRequest(
                new HealthyShop(productsAvailable),
                productsOrdered,
                new User("Maciek","Kielce")
        ));


    }
}
