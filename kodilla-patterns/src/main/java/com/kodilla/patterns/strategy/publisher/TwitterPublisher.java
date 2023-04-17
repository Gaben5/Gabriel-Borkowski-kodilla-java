package com.kodilla.patterns.strategy.publisher;

public final class TwitterPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Twitter";
    }
}
