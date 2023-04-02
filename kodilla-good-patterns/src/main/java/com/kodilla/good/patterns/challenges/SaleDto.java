package com.kodilla.good.patterns.challenges;

public class SaleDto {
    private User user;
    private boolean isAvaliable;

    public SaleDto(final User user, final boolean isAvaliable) {
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
