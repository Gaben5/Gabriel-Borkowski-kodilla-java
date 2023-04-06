package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public interface OrdersSuppliers {
    boolean process(Map<String, Integer> productsAvailable);
}
