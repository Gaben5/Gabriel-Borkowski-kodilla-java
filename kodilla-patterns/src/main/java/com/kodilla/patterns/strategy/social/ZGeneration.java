package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.publisher.SnapchatPublisher;

public final class ZGeneration extends User{
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
