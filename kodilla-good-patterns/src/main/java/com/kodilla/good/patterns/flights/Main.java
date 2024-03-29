package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FlightWithTransfer> flightWithTransfers = new ArrayList<>();
        String direction = "Gdańsk";
        String from = "Gdańsk";
        Flight flight = new Flight(from,direction);
        FlightSearch flightSearch = new FlightSearch();
        flightSearch.isFlightAvailable(flight);

        flightWithTransfers = flightSearch.isIndirectFlightExist(flight);
        System.out.println(flightWithTransfers);
    }
}
