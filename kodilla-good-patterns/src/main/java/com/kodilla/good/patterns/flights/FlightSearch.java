package com.kodilla.good.patterns.flights;

import java.util.ArrayList;

public class FlightSearch {
    private ArrayList<Flight> flights = new ArrayList<>();

    public FlightSearch() {
        flights.add(new Flight("Kraków","Warszawa"));
        flights.add(new Flight("Kraków","Gdańsk"));
        flights.add(new Flight("Kraków","Katowice"));
        flights.add(new Flight("Gdańsk","Warszawa"));
        flights.add(new Flight("Warszawa","Katowice"));
    }
    public void isFlightAvailable(Flight flight){
        boolean isFlightExist = flights.contains(flight);

        if (isFlightExist){
            System.out.println("Direction of flight:" + flight);
        }else {
            System.out.println("Direction of flight doesn't Exist");
        }
    }

}
