package com.kodilla.patterns.predictors;

public final class ConservativePredictor implements BuyPredictor{
    @Override
    public String predictWhatToBuy() {
        return "[Conservative predictor] Buy debentures of XYZ";
    }
}
