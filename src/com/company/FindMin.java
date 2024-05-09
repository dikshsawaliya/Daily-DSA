package com.company;

public class FindMin {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,-3,2,-45};
        System.out.println(FindMin(num));
    }

    static int FindMin(int[] numArray){
        int element = numArray[0];
        for (int i=0; i< numArray.length; i++){
            if (numArray[i] < element){
                element = numArray[i];
            }
        }
        return element;
    }
}
