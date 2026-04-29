package com.company.leetcode;

import java.util.Arrays;

public class Concatenate {

    public static void main(String[] args) {
        int [] arr = {1,2,1};
        System.out.println(Arrays.toString(concatenate(arr)));
    }

    static int [] concatenate(int [] arr){
        int [] newArr = new int[arr.length*2];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
            newArr[i + arr.length ] = arr[i];
        }

        return newArr;
    }

}
