package com.company;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9};
        System.out.println(ceilingNumber(arr, 10));

    }

    static int ceilingNumber(int[] arr, int target){

        for (int i =0; i < arr.length; i++){
            if (arr[i] == target){
                return arr[i];
            }
        }

        return -1;
    }
}
