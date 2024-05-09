package com.company;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int[][] nums2D = {
            {23,12,30},
            {32,45,342},
            {2323,12,1112,5}
        };
        int[] ans = searchInArray(nums2D, 5);
        System.out.println(Arrays.toString(ans)); //Necessary to convert the answer to String format otherwise
                                                  //will throw random numbers.


    }

    static int[] searchInArray(int [][] numsArrray, int target){
        for (int row = 0; row < numsArrray.length; row++){      //Iterating through the rows
            for (int col = 0; col <numsArrray[row].length; col++){      //Iterating through the columns
                if (numsArrray[row][col]== target){
                    return new int[]{row,col};      //returning the integers row and column
                }
            }
        }
        return new int[]{-1};
    }

}
