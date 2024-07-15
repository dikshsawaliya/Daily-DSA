package com.company;

public class Fibonacci {


    //Question : Find the nth number of the fibonacci series.

    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    //Below function is basically using the recursive tree to call the functions.
    //You can see the fibo(n-1) will be called and completing the circle then it will go in fibo(n-2)

    static int fibo(int n){

        //Base condition
        if (n <2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
