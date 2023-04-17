package com.kodilla.patterns.strategy;

import com.kodilla.patterns.predictors.AggressivePredictor;

public final class IndividualYoungCustomer extends Customer{
    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AggressivePredictor();
    }
}
