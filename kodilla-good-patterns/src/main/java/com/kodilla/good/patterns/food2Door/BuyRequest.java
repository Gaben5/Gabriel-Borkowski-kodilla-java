package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class BuyRequest {
    private final Distributor distributor;
    public BuyRequest(Distributor distributor, Map<String, Integer> products) {
        this.distributor = distributor;
    }
    public Distributor getDistributor() {
        return distributor;
    }

}
