package com.company;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {
                {1,2},
                {2,3},
                {3,4,5,6}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][]account){
        int total = 0;
        for (int row = 0; row < account.length; row++){
            for (int col =0; col < account[row].length; col++){
                total = account[row][col];
            }
        }
        return total;
    }
}
