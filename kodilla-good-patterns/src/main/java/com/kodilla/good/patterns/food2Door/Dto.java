package com.kodilla.good.patterns.food2Door;

public class Dto {
    public Distributor distributor;
    public boolean isAvailable;

    public Dto(final Distributor distributor,final boolean isAvailable) {
        this.distributor = distributor;
        this.isAvailable = isAvailable;
    }
}
