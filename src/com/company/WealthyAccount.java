package com.company;

public class WealthyAccount {
    
    public static void main(String[] args) {

        int [][] arr = {{1,3},
                        {2,3,21},
                        {3,2,3,4},
                        {4,3,4,5,4}};
                        
        int result = wealthyAccount(arr);
                System.out.println(result);
              
    }
        


    private static int wealthyAccount(int[][] accounts) {

        int result =  0;

        for(int person = 0; person < accounts.length; person++){
            int sum =0;
            for (int accountOfPerson = 0; accountOfPerson < accounts[person].length; accountOfPerson++) {
                sum +=  accounts[person][accountOfPerson];
            }

            if (result < sum) {
                result = sum;
            }
        }

        
        return result;
    }
}
