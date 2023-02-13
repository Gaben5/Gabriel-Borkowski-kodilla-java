package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    public Map<String, Double> calculateForecast(){
        Map<String,Double> resultMap = new HashMap<>();

        for(Map.Entry<String,Double> temperature : temperatures.getTemperatures().entrySet()){


            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public Double AvgTemperature(){
        Map<String,Double> forecastData = new HashMap<>();
        List<Double> avgNumbers = new ArrayList<>();
        double avg = 0;

        for (Map.Entry<String,Double> retrievedTemperatures: temperatures.getTemperatures().entrySet()){

            forecastData.put(retrievedTemperatures.getKey(),retrievedTemperatures.getValue());
            avgNumbers.add(retrievedTemperatures.getValue());


        }

        for (int i = 0 ; i<avgNumbers.size() ; i++){
            avg += avgNumbers.get(i);
        }
        avg = avg/avgNumbers.size();

        return avg;
    }



    public Double MedianTemperature(){
        Map<String,Double> forecastData = new HashMap<>();
        List<Double> medianNumbers = new LinkedList<>();

        double median;

        for(Map.Entry<String,Double> retrievedTemperatures: temperatures.getTemperatures().entrySet()){

            forecastData.put(retrievedTemperatures.getKey(), retrievedTemperatures.getValue());
            medianNumbers.add(retrievedTemperatures.getValue());
        }
        Collections.sort(medianNumbers);
        if (medianNumbers.size() % 2 == 0){
            double sumOfMiddleEllements = (double) (medianNumbers.get((int) ((medianNumbers.size()/2)-0.5))) + medianNumbers.get((int) ((medianNumbers.size()/2)+0.5)) ;
            median = sumOfMiddleEllements / 2;
        }else {
            median =  medianNumbers.get(medianNumbers.size()/2) ;
        }

        return median;
    }



}
