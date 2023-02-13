package com.kodilla.testing.weather.stub;

import java.util.HashMap;
import java.util.Map;

public class TemperaturesStub implements Temperatures{

    public Map<String,Double> getTemperatures(){
        Map<String,Double> stubResult = new HashMap<>();

        //dummy data
        stubResult.put("Rzeszów",25.5);
        stubResult.put("Krakow",26.2);
        stubResult.put("Wroclaw",26.8);
        stubResult.put("Warszawa",25.2);
        stubResult.put("Gdansk",26.1);

        return stubResult;
    }
}
