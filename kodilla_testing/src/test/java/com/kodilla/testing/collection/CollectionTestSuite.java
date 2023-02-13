package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void beforeAll(){
        System.out.println("Before all");
    }
    @AfterEach
    public void afterAll(){
        System.out.println("After all");
    }

    @DisplayName("test odd numbers exterminator empty List")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        List<Integer> list1 = new ArrayList<>();
        OddNumbersExterminator ex1 = new OddNumbersExterminator();
        //When
        System.out.println("Checking list(empty) ex1: " +ex1);
        //Then
        Assertions.assertEquals(ex1.exterminate(list1),list1);
    }

    @DisplayName("test Odd Numbers Exterminator Normal List")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++){
            if (i%2 == 0 ) {
                list2.add(i);
            }
        }
        OddNumbersExterminator ex2 = new OddNumbersExterminator();
        //When
        List<Integer> list1 = Arrays.asList(0,2,4,6,8);
        System.out.println("Checking normal list: "+ex2.exterminate(list1));
        System.out.println("Checking result: "+list2);
        //Then
        Assertions.assertEquals(list2,ex2.exterminate(list1));
    }
}
