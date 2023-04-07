package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> productsAvailable = new HashMap<>();
        productsAvailable.put("Apple",50);
        productsAvailable.put("Orange",100);
        productsAvailable.put("Banana",150);

        HashMap<String,Integer> productsOrdered = new HashMap<>();
        productsOrdered.put("Apple",10);
        productsOrdered.put("Orange",20);
        productsOrdered.put("Banana",30);


        OrderService orderService = new OrderService();
        orderService.process(new BuyRequest(
                new HealthyShop(productsAvailable),
                productsOrdered,
                new User("Maciek","Kielce")
        ));



    }
}
