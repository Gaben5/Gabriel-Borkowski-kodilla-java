package com.kodilla.patterns.enums.hotel;

import com.kodilla.patterns.PatternsRunner;

public class HotelApp {
    public static void main(String[] args) {
        System.out.println("Accomodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season: " + PriceList.getSindgleBedPrices(Season.LOW));
        System.out.println("   - high season: " + PriceList.getSindgleBedPrices(Season.HIGH));
        System.out.println("   - holiday season: " + PriceList.getSindgleBedPrices(Season.HOLIDAY));
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season: " + PriceList.getDoubleBedPrices(Season.LOW));
        System.out.println("   - high season: " + PriceList.getDoubleBedPrices(Season.HIGH));
        System.out.println("   - holiday season: "+ PriceList.getDoubleBedPrices(Season.HOLIDAY));

        Season season = Season.HOLIDAY;

        System.out.println(season);
    }
}
