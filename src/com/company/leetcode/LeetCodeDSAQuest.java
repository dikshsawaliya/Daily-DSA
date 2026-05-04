package com.company.leetcode;

import java.util.Arrays;

public class LeetCodeDSAQuest {

    public static void main(String[] args) {
        int [] arr = {8,1,2,2,3};
//        System.out.println(Arrays.toString(concatenate(arr)));
//        System.out.println(Arrays.toString(shuffle(arr, 3)));
//        System.out.println(findMaxConsecutiveOnes(arr));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    static int [] concatenate(int [] arr){
        int [] newArr = new int[arr.length*2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[i + arr.length ] = arr[i];
        }

        return newArr;
    }

    static int[] shuffle(int[] nums, int n) {

        // 2 5 1 3 4 7
        int [] newArr = new int [nums.length];
        for (int i = 0; i < n; i++) {
            newArr[ i * 2] = nums[i];
            newArr[i*2 +1] = nums[i+n];
        }

        return newArr;
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int countMax = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                count++;
            }else{
                if(countMax < count) {
                    countMax = count;
                }
                count =0;
            }
        }
        if(countMax > count){
            return countMax;
        }else {
            return count;
        }
    }

    static int[] findErrorNums(int[] nums) {

        int [] newArr = new int [2];

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i +1){
                if(i ==0){
                    newArr[0] = nums[i] -1;
                    newArr[1] = nums[i];
                }else {
                    newArr[0] = nums[i - 1];
                    newArr[1] = nums[i] + 1;
                }}
        }
        return newArr;

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int [] newArr = new int[nums.length];
        int count;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    count++;
                }
                newArr[i] = count;
            }
        }
        return newArr;
    }


}
