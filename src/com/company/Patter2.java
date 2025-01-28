package com.company;

public class Patter2 {
    
    // * * *
    // * * *
    // * * *

    static void pattern2(int n){
            //for every row is running n times
        for (int row = 1; row <= n; row++) {
            //for every col is running n times
            for (int col = 1; col <= n; col ++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern2(3);
    }
}
