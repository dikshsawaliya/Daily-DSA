package com.company.leetcode;

import java.util.Arrays;

public class SortedSquares {
    public static void main(String[] args) {
        int [] nums = {-7,-3,2,3,11};
        System.out.println(Arrays.toString(sortedSquaresOptimised(nums)));
    }


    static  int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }

    static int [] sortedSquaresOptimised(int []nums){

        int left = 0;
        int right = nums.length -1;

        int index = nums.length - 1;

        int [] newArr = new int[nums.length];

        while(left <= right){

            int squareLeft = nums[left] * nums[left];
            int squareRight = nums[right] * nums[right];

            if (squareLeft > squareRight){
                newArr[index] = squareLeft;
                left++;
            }else {
                newArr[index] = squareRight;
                right --;
            }
            index--;
        }
        return newArr;
    }
}
