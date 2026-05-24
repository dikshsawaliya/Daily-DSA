package com.company.leetcode;

import java.util.Arrays;

public class MoveZeroes {

    public static void main(String[] args) {
        int [] nums = {1,0};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    static int [] moveZeroes(int[] nums) {

        if (nums.length <1){
            return new int[]{0};
        }

        int left = 0;
        int right = 1;

        while(right < nums.length) {
            if (nums[left] == 0) {
                if (nums[right] != 0) {
                    int temp = nums[left];
                    nums[left] = nums[right];
                    nums[right] = temp;
                    left++;
                    right++;
                }else{
                    right++;
                }
            }else{
                left++;
                right++;
            }
        }
        System.out.println();
        return nums;
    }

}
