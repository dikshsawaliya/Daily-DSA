package com.company;

public class SearchInArrayRecursion {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,7,8,9};
        System.out.println(searchInArray(arr, 5, 0));
    }

    static int searchInArray(int arr[], int target, int index){

        //Base condition to check if the target does not exist return -1
        if (arr[index] == arr.length){
            return -1;
        }

        //Condition to check if the index's value is same as target then return index, else recursively move to index +1
        if (arr[index] == target){
            return index;
        }else {
            return searchInArray(arr, target, index+1);
        }
    }
}
