package com.company;

public class ConceptRecursive {

    public static void main(String[] args) {
        conceptRecursive(5);
    }

    static void conceptRecursive(int n){

        if (n == 0) {
            return;
        }

        System.out.println(n);
        conceptRecursive(--n);

        //Above you can see we have used --n instead of n--. Look into the notes if you have any doubt.
    }
}
