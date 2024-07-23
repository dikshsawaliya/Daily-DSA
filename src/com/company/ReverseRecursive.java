package com.company;

public class ReverseRecursive {

    public static void main(String[] args) {
        reverse(1234);
        System.out.println(sum);
    }

    static int sum = 0;

    static void reverse(int n){

        if (n == 0) {
            return;
        }

        int remainder = n % 10;  //Modulo returns the remainder i.e, here the last digit of the integer
        sum = sum * 10 + remainder;
        reverse(n/10);  //Divide sign discards the last digit of the integer. For example : 432/10 = 43, as it discards the remainder that is 2.
    }
}
