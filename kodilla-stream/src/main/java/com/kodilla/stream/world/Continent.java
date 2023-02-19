package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }
    public void addCounty(Country country){
        countryList.add(country);
    }
    public boolean removeCounty(Country country){
        return countryList.remove(country);
    }
    public List<Country> getCountryList(){
        return countryList;
    }


}
