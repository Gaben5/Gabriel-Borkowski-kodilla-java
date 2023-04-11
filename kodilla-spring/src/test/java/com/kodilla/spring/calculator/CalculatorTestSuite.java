package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {
    @Test
    void testCalculations(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double resultAdd = calculator.add(2.5,2);
        double resultsub = calculator.sub(2.5,2);
        double resultMul = calculator.mul(2.5,2);
        double resultDiv = calculator.div(6,2);
        //Then
        assertEquals(4.5,resultAdd);
        assertEquals(0.5,resultsub);
        assertEquals(5,resultMul);
        assertEquals(3,resultDiv);
    }

}
