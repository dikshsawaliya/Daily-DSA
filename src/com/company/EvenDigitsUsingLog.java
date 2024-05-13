package com.company;

public class EvenDigitsUsingLog {

    public static void main(String[] args) {
        int[] numsArray = {12,3422,2,5,2344,12,12,-3344,2,21};
        System.out.println(findNumbers(numsArray));

    }

    static int findNumbers(int[] nums){
        int count = 0;

        for(int num: nums){
            if (even(num)){
                count ++;
            }
        }
        return count;
    }

    //function to check whether the digits contained are of even number or not
    static boolean even(int num) {

        int numberOfDigits = digits(num);

        return numberOfDigits %2 ==0;
    }

    private static int digits(int num) {

        if (num < 0 ){
            num = num * -1;     //check for negative number by converting them in to positive.
        }

        return (int)(Math.log10(num)) +1;
    }
}
