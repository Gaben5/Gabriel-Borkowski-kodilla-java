package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class BuyRequest {
    private final User user;
    private final boolean isAvaliable;

    public BuyRequest(final User user, final boolean isAvaliable) {
        this.user = user;
        this.isAvaliable = isAvaliable;
    }

    public User getUser() {
        return user;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }
}
