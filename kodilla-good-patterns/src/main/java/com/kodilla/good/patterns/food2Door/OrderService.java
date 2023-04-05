package com.kodilla.good.patterns.food2Door;


import java.util.Map;

public class OrderService {
    private final OrdersSuppliers ordersSuppliers;

    public OrderService(OrdersSuppliers ordersSuppliers) {
        this.ordersSuppliers = ordersSuppliers;
    }

    public void process(final BuyRequest buyRequest){
        Map<String, Integer> productsAvailable = buyRequest.getDistributor().getProducts();

        boolean isAvailable = ordersSuppliers.process(buyRequest,productsAvailable);

        if (isAvailable){
            new Dto(buyRequest.getDistributor(), true);
        }else {
            new Dto(buyRequest.getDistributor(), false);

        }
    }
}
