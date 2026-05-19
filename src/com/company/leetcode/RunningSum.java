package com.company.leetcode;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    static int[] runningSum(int[] nums) {
        int right = 1;

        int [] arr = new int [nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0){
                arr[i] = nums[i];
            }else {
                arr[i] = arr[i - 1] + nums[right];
                right++;
            }
        }
        return arr;
    }
}
