package com.kodilla.patterns.strategy;

import com.kodilla.patterns.predictors.ConservativePredictor;

public final class IndividualCustomer extends Customer{
    public IndividualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
