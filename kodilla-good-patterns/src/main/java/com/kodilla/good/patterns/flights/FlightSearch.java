package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FlightSearch {
    private final ArrayList<Flight> flights = new ArrayList<>();

    public FlightSearch() {
        flights.add(new Flight("Kraków","Wrocław"));
        flights.add(new Flight("Kraków","Gdańsk"));
        flights.add(new Flight("Kraków","Katowice"));
        flights.add(new Flight("Gdańsk","Wrocław"));
        flights.add(new Flight("Wrocław","Gdańsk"));
        flights.add(new Flight("Katowice","Gdańsk"));
    }
    public void isFlightAvailable(Flight flight){
        boolean isFlightExist = flights.contains(flight);

        if (isFlightExist){
            System.out.println("Direction of flight:" + flight);
        }else {
            System.out.println("Direction of flight doesn't Exist");
        }
    }
    public ArrayList<FlightWithTransfer> isIndirectFlightExist(Flight flight){
        try {
            return (ArrayList<FlightWithTransfer>) flights.stream()
                    .filter(f-> f.getDeparture().equals(flight.getDeparture()))
                    .flatMap(f1->flights.stream()
                            .filter(f2->f2.getDeparture().equals(f1.getArrival()))
                            .filter(f2->f2.getArrival().equals(flight.getArrival()))
                            .filter(f2->f1.getArrival().equals(f2.getDeparture()))
                            .map(f2 -> new FlightWithTransfer(f1,f2)))
                    .collect(Collectors.toList());
        }catch (Exception e){
            System.out.println("Exception: "+e);
            return null;
        }
    }

}
