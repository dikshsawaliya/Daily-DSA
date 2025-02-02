package com.company.Pattern;

public class Pattern3 {
    

    // * * * *
    // * * *
    // * *
    // *


    static void pattern3(int n){

        //for every row that is printing 
        for(int row = 1; row <= n; row ++){
            //column will be printing inversely
            for(int col = 1; col <= n-row +1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern3(5);
    }
}
