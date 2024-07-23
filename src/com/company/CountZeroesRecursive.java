package com.company;

public class CountZeroesRecursive {

    public static void main(String[] args) {

        System.out.println(count(30200024));
    }

    static int count(int n){
        return helper(n, 0);
    }

    private static int helper(int n , int count){

        if (n==0){
            return count;
        }

        int remainder = n %10;  //First it is finding out the remainder that is last digit
        if (remainder ==0){ //Then if the digit is 0 it is increasing the count and also discarding the last digit.
            return helper(n/10, count+1);
        }
        return helper(n/10, count); //If the last digit is not zero then the count will remain the same.
    }
}
