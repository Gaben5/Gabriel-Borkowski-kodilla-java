package com.kodilla.good.patterns.flights;

public class Main {
    public static void main(String[] args) {
        String direction = "Gdański";
        String from = "Kraków";
        Flight flight = new Flight(from,direction);
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.isFlightAvailable(flight);
    }
}
