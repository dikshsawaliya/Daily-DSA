package com.company;

public class PalindromeRecursive {

    static int sum = 0;

    static void reverseNumber(int n ){

        if (n  ==0){
            return;
        }

        int remainder = n %10;
        sum = sum * 10 + remainder;
        reverseNumber(n/10);
    }

    static boolean isPalindrome(int n){
        reverseNumber(n);
        return n == sum; // Here we just check if the number is equal to the reverse of the number then it returns true.
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1234431));
    }
}
