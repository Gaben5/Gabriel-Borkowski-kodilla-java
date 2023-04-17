package com.kodilla.patterns.strategy;

import com.kodilla.patterns.predictors.BalancedPredictor;

public final class CorporateCustomer extends Customer{
    public CorporateCustomer(String name) {
        super(name);
        this.buyPredictor = new BalancedPredictor();
    }
}
