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
    public Double avgTemperature(){
        Collection<Double> collection = temperatures.getTemperatures().values();
        double avg = 0;
        for (Double avarage: collection){
            avg+=avarage;
        }
        avg = avg/collection.size();
        return avg;
    }



    public Double medianTemperature(){
        double median = 0.0;
        List<Double> medianNumbers = new ArrayList<>();
        medianNumbers.addAll(temperatures.getTemperatures().values());
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
