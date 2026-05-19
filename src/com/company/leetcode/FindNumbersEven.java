package com.company.leetcode;

public class FindNumbersEven {

    public static void main(String[] args) {

        int [] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {

        int totalEvenDigitsNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            int digits = (int)(Math.log10(Math.abs(nums[i]))) + 1;
            if (digits % 2 == 0){
                totalEvenDigitsNumbers++;
            }
        }

        return totalEvenDigitsNumbers;

    }

}
