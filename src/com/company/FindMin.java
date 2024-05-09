package com.company;

public class FindMin {

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,-3,2,-45};
        System.out.println(FindMin(num));
    }

    static int FindMin(int[] numArray){
        int element = numArray[0]; // Initialised an int element with the first index of the array
        for (int i=1; i< numArray.length; i++){
            if (numArray[i] < element){     //Then iterating the loop from the second index
                                            // and checking whether the element is smaller than the next number in array
                element = numArray[i];
            }
        }
        return element;
    }
}
