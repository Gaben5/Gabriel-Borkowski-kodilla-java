package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> airports = new HashMap<>();
        airports.put("Warsaw",true);
        airports.put("Berlin",true);
        airports.put("Katowice",true);
        airports.put("Tokyo",false);
        if (airports.containsKey(flight.getArrivalAirport())){
            if (airports.get(flight.getArrivalAirport())){
                System.out.println("You can fly there");
            }else {
                System.out.println("You can't fly there");
            }
        }else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) throws RouteNotFoundException {
        FlightSearch flightSearch = new FlightSearch();
        Flight flightToBerlin = new Flight("Warsaw","Berlin");
        Flight flightToPakistan = new Flight("Maslow","Pakistan");
        Flight flightToTokyo = new Flight("Oslo","Tokyo");
        try {
            flightSearch.findFlight(flightToBerlin);
        }catch (RouteNotFoundException e){
            System.out.println("You can't fly to Berlin");
        }
        try {
            flightSearch.findFlight(flightToPakistan);
        }catch (RouteNotFoundException e){
            System.out.println("You can't fly to Pakistan");
        }
        try {
            flightSearch.findFlight(flightToTokyo);
        }catch (RouteNotFoundException e){
            System.out.println("You can't fly to Tokyo");
        }
    }
}
