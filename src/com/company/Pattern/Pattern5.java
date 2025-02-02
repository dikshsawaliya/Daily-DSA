package com.company.Pattern;


public class Pattern5 {


    static void pattern5(int k){

        for(int row =0; row <= k; row++){
            for(int col =0; col <= row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int row =0; row <= k; row++){
            for(int col =0; col <= k- row ; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern5(5);
    }
    
}