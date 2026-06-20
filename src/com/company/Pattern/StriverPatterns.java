package com.company.Pattern;

public class StriverPatterns {

    public static void main(String[] args) {
//        boxStars(5);
        stairAscendingNum(5);
    }

    static void boxStars(int n ){

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
    static void stairsAscending(int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void stairAscendingNum( int n ){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}
