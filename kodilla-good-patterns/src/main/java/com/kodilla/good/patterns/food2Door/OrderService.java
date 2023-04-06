package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class OrderService {
    public void process(final BuyRequest buyRequest){
        Map<String,Integer> productsOrdered = null;
        productsOrdered.put("Apple",10);
        productsOrdered.put("Orange",20);
        productsOrdered.put("Banana",30);
        boolean isAvailable = buyRequest.getOrdersSuppliers().process(productsOrdered);

        if (isAvailable){
            new Dto(buyRequest.getOrdersSuppliers(), true);
        }else {
            new Dto(buyRequest.getOrdersSuppliers(), false);
        }
    }

}
