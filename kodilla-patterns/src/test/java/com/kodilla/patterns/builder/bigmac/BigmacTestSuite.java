package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {
    @Test
    void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Thin")
                .sauce("Spicy")
                .burgers(5)
                .ingredient("Mushroom")
                .ingredient("Pepperoni")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(2,howManyIngredients);
        assertEquals(5,bigmac.getBurgers());
        assertEquals("Thin",bigmac.getBun());
        assertEquals("Spicy",bigmac.getSauce());
    }
}
