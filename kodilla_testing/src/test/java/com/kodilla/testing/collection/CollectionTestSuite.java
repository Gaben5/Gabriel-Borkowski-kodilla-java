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

        OddNumbersExterminator ex1 = new OddNumbersExterminator(list1);
        //When
        List<Integer> result = ex1.getOddNumbers();
        System.out.println("Checking list(empty) ex1: " +ex1.getOddNumbers());
        //Then
        Assertions.assertEquals(ex1.getOddNumbers(),result);
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
        OddNumbersExterminator ex2 = new OddNumbersExterminator(list2);
        //When
        List<Integer> result = Arrays.asList(0,2,4,6,8);
        /*result.add(0);
        result.add(2);
        result.add(4);  Poprzednio było z ArrayList dodawane i działało
        result.add(6);  To z zadania dodatkowego
        result.add(8);*/
        System.out.println("Checking normal list: "+ex2.getOddNumbers());
        System.out.println("Checking result: "+result);
        //Then
        Assertions.assertEquals(result,ex2.getOddNumbers());
    }
}
