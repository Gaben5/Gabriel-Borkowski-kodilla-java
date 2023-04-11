package com.kodilla.spring.calculator;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    private final Display display;

    public Calculator(final Display display) {
        this.display = display;
    }

    public Double add(double a, double b){
        display.displayValue(a+b);
        return a+b;
    }
    public Double sub(double a, double b){
        display.displayValue(a-b);
        return a-b;
    }
    public Double mul(double a, double b){
        display.displayValue(a*b);
        return a*b;
    }
    public Double div(double a, double b){
        display.displayValue(a/b);
        return a/b;
    }
}
