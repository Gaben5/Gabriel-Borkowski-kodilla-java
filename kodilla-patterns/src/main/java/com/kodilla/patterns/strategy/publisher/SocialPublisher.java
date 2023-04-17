package com.kodilla.patterns.strategy.publisher;

public sealed interface SocialPublisher permits FacebookPublisher, SnapchatPublisher, TwitterPublisher {
    public String share();
}
