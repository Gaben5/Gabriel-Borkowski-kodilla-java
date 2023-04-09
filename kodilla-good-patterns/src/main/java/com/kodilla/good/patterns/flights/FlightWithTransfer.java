package com.kodilla.good.patterns.flights;

public class FlightWithTransfer {
    private final Flight firstFlight;
    private final Flight secondFlight;

    public FlightWithTransfer(final Flight firstFlight,final Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }
    @Override
    public String toString() {
        return "FlightWithTransfer{" +
                "firstFlight=" + firstFlight +
                ", secondFlight=" + secondFlight +
                '}';
    }
}
