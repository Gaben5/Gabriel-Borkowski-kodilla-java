package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public interface OrdersSuppliers {
    boolean process(BuyRequest buyRequest, Map<String,Integer> productsAvailable);
}
