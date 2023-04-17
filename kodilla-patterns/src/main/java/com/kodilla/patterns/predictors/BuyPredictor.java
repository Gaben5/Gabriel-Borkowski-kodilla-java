package com.kodilla.patterns.predictors;

public sealed interface BuyPredictor permits AggressivePredictor, BalancedPredictor, ConservativePredictor {
    String predictWhatToBuy();
}
