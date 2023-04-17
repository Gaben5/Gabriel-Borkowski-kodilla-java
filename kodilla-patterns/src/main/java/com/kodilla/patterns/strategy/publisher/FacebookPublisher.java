package com.kodilla.patterns.strategy.publisher;

public final class FacebookPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Facebook";
    }
}
