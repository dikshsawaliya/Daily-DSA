package com.company;

public class SearchInRange {

    public static void main(String[] args) {
        int[] num = {1,2,3,5,9,6,7,23,43,55};
        int ans = searchInRange(num, 2,1,7);
        System.out.println(ans);
    }

    static int searchInRange(int[] arr,int target, int rangeA, int rangeB){
        for (int i = rangeA; i < rangeB; i++){
            int element = arr[i];
            if (element == target){
                return i;
            }
        }
        return -1;
    }
}
