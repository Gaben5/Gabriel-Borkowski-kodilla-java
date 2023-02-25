package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException{
        if (b == 0 ){
            throw new ArithmeticException();
        }
        return a/b;
    }
    public int power(int a, int b){
        int pow = a;
        int result = 0;
        if (b == 0){
            result = 1;
        } else if (a == 0) {
            result = 0;
        } else if (b == 1) {
            result = a;
        } else {
            for (int i = 0 ; i < b ; i++){
               result = a *= pow;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;
        try {
            result = firstChallenge.divide(3,0);
        } catch (ArithmeticException e){
            System.out.println("Sorry you cant divide by 0, Exception: "+e);
        }finally {
            System.out.println("result: "+result);
            System.out.println("Done");
        }

        int resultPower1 = firstChallenge.power(0,5);
        int resultPower2 = firstChallenge.power(5,0);
        int resultPower3 = firstChallenge.power(5,1);

    }
}
