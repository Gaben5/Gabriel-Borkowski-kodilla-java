package com.kodilla.exception.test;

public class ExceptionHandling {



    public static void main(String[] args) throws Exception{
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(3,2);
        }catch (Exception e){
            System.out.println("exception!");
        }finally {
            System.out.println("Still i am here");
        }

    }

}
