package com.company;

public class EvenDigits {

    public static void main(String[] args) {
        int[] numsArray = {12,3422,2,5,2344,12,12,-3344};
        System.out.println(findNumbers(numsArray));

    }

    static int findNumbers(int[] nums){
        int count = 0;

        for(int num: nums){
            if (num< 0 ){
                num = num * -1;     //check for negative number by converting them in to positive.
            }
            if (even(num)){
                count ++;
            }
        }
        return count;
    }

    //function to check whether the digits contained are of even number or not
    static boolean even(int num) {
        String stringOfNumber = String.valueOf(num);
        int numberOfDigits = stringOfNumber.length();
        if (numberOfDigits %2 ==0){
            return true;
        }else {
            return false;
        }
    }
}
