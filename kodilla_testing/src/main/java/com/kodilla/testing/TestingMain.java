package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test ok");
        }else {
            System.out.println("Error");
        }

        int x;
        Calculator calc = new Calculator();
        x = calc.add(3,7);
        if (x ==10){
            System.out.println("add test ok");
        }else{
            System.out.println("add test Error");
        }

        x = calc.subtract(20,10);

        if (x ==10){
            System.out.println("subtract test ok");
        }else{
            System.out.println("subtract test Error");
        }


    }
}
