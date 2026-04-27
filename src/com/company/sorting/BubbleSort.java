package com.company.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr [] = {1 ,4 ,6 ,5 ,2 ,3};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int [] arr){

        //1 4 6 5 2 3

        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
