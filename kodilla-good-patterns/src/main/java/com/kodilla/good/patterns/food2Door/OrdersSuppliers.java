package com.kodilla.good.patterns.food2Door;

import java.util.HashMap;

public interface OrdersSuppliers {
    boolean process(HashMap<String, Integer> productsOrdered);
}
