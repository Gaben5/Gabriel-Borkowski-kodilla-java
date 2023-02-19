package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe");
        europe.addCounty(new Country("Poland",new BigDecimal(37750000)));
        europe.addCounty(new Country("France",new BigDecimal(67750000)));
        europe.addCounty(new Country("Germany",new BigDecimal(83200000)));

        Continent asia = new Continent("Asia");
        asia.addCounty(new Country("Russia",new BigDecimal(143400000)));
        asia.addCounty(new Country("Russia",new BigDecimal(1412000000)));
        asia.addCounty(new Country("India",new BigDecimal(140800000)));

        Continent africa = new Continent("Africa");
        africa.addCounty(new Country("Nigeria",new BigDecimal(213400000)));
        africa.addCounty(new Country("Kenya",new BigDecimal(53010000)));
        africa.addCounty(new Country("Ghana",new BigDecimal(32830000)));

        //When
        World world = new World();
        world.continentList.add(europe);
        world.continentList.add(asia);
        world.continentList.add(africa);
        //Then
        BigDecimal result = new BigDecimal("2184140000");
        assertEquals(result,world.getPeopleQuantity());

    }
}
