package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] arrayList   = {1,2,3,4,5};
        System.out.println(arrayList);
        int ans =  linearSearch(arrayList, 4);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int num) {
        if (arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == num){
                return  i;
            }
        }
        return -1;
    }
}
