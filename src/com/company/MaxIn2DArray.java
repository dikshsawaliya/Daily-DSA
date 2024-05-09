package com.company;

import java.util.Arrays;

public class MaxIn2DArray {

    public static void main(String[] args) {
        int[][] nums2D = {
                {23,12,30},
                {32,4,342},
                {2323,12,1112,50}
        };
        int ans = maxInArray(nums2D);
        System.out.println(ans); //Necessary to convert the answer to String format otherwise
        //will throw random numbers.


    }

    static int maxInArray(int [][] numsArrray){
        int element = numsArrray[0][0];
        for (int row = 0; row < numsArrray.length; row++){      //Iterating through the rows
            for (int col = 0; col <numsArrray[row].length; col++){      //Iterating through the columns
                if (numsArrray[row][col] < element){        // Use < for min and > for max
                    element = numsArrray[row][col];      //returning the integer which is the smallest
                }
            }
        }
        return element;
    }
}
