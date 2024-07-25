package com.company;

public class SortArrayRecursion {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,560,78};
        System.out.println(sortArray(arr, 0));
    }

    static boolean sortArray(int arr[], int index){

        //Base condition to check if the array is at the last index
        if (index == arr.length -1){
            return true;
        }

        //First condition checking whether the first index is less than the next index
        //Second condition is for the recursion call for the same array but with the index increasing by 1.
        return arr[index] < arr[index +1] && sortArray(arr, index +1);
    }

}
