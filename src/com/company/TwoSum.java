package com.company;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.Arrays;


//You may assume that each input would have exactly one solution, and you may not use the same element twice.


public class TwoSum {

    static  int[] twoSum(int[] nums, int target) {

        for(int i =0; i < nums.length; i++){
            for(int j =0; j< nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int []{i,j};
                }

            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
   
    public static void main(String[] args) {
    int [] arr = {1,2,3,45,6,7,8};
    int target = 48;
    int []result = twoSum(arr, target);
    System.out.println(Arrays.toString(result));
    }
}
