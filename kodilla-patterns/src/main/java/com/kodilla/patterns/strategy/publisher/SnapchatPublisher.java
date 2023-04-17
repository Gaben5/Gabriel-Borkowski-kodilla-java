package com.kodilla.patterns.strategy.publisher;

public final class SnapchatPublisher implements SocialPublisher{
    @Override
    public String share() {
        return "Snapchat";
    }
}
