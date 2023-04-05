package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> productsAvailable = new HashMap<>();
        productsAvailable.put("Apple", 10);
        productsAvailable.put("Orange", 20);
        productsAvailable.put("Banana", 120);

        Distributor distributor = new Distributor("Healthy Shop", "Kielce", productsAvailable);

        HashMap<String,Integer> order = new HashMap<>();
        order.put("Apple",1);
        order.put("Orange",5);
        order.put("Banana",10);

        BuyRequest buyRequest = new BuyRequest(distributor,order);

        OrderService orderService = new OrderService(new ExtraFoodShop());
        orderService.process(buyRequest);


    }
}
