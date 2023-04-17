package com.kodilla.patterns.predictors;

public final class AggressivePredictor implements BuyPredictor{
    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
