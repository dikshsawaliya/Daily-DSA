package com.company;

public class FactorialRecursive {

    public static void main(String[] args) {

        System.out.println("Sum of the digits : " + sumOfNumbers(5));
        System.out.println("Factorial is : " +factorial(5));

    }

    //Below is the factorial of the numbers

    static int factorial(int n){

        if (n <=1){
            return 1;
        }

        return n * factorial(n-1);
    }

    //below is the sum of n numbers

    static int sumOfNumbers(int n){

        if (n <1){
            return 0;
        }

        return n + sumOfNumbers(n-1);
    }
}
