package com.kodilla.good.patterns.food2Door;

public class OrderService {
    public void process(final BuyRequest buyRequest){
        boolean isAvailable = buyRequest.getOrdersSuppliers().process(buyRequest.getProductsOrdered());

        if (isAvailable){
            new Dto(buyRequest.getOrdersSuppliers(), true);
        }else {
            new Dto(buyRequest.getOrdersSuppliers(), false);
        }
    }

}
