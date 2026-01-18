package com.company;


import java.util.HashMap;
import java.util.Map;
import java.util.function.IntToDoubleFunction;

public class Playground {

    public static void main(String[] args) {

//        String haystack = "WWELEETCODE";
//        String needle = "LEET";
//        System.out.println(strStr(haystack, needle));

//        printNumbers(5);
//        System.out.println(sumFirstNumbers(3));
        System.out.println(factorialRecursion(5));
    }


    static void countDigits(int n){

        if()
    }


    static int factorialRecursion(int n){

        if (n < 2){
            return n;
        }

        return Math.multiplyExact(n, factorialRecursion(n-1));
    }

    static int sumFirstNumbers(int n){
        if(n ==0){
            return n;
        }
        return n + sumFirstNumbers(n-1);
    }


    static void printNumbers(int n){
        if(n == 0){
            return ;
        }
        printNumbers(n-1);
        System.out.println(n);
    }

    public static int strStr(String haystack, String needle) {

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if(haystack.startsWith(needle, i)){
                return i;
            }
        }
        return -1;
    }


    public static int removeElement(int [] nums, int val){

        //1,2,3,4,5

        int [] arr = new int [nums.length];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == val){
                arr[i] = 99;
            }else{
                arr[i] = nums[i];
                System.out.println(nums[i]);
            }

        }
        return arr.length;
    }



    public static int multiplesSum(int number){

        int sum =0;

        for (int i = 1; i < number; i++) {
            if(i % 3 == 0 ) {
                sum+=i;
                System.out.println("3 ->" + i);
            }
            else if(i % 5 ==0){
                sum+=i;
                System.out.println("5 ->" + i);
            }
        }

        return sum;
    }

    public static Map<Character, Integer> octopus(String sentence){

        StringBuffer stringBuffer = new StringBuffer();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        //L E T T E R

        for (int i = 0; i < sentence.length(); i++) {
            Character character ='\0';
            character = sentence.charAt(i);

            if(character == '\0'){
                stringBuffer.append("_");
            }else if(count < 8){
                if(!map.containsKey(character)){
                    map.put(character, 1);
                    stringBuffer.append(character);
                }else{
                    int tempKey = map.get(character);
                    tempKey +=1;
                    map.replace(character,tempKey);
//                map.put('*',1);
                }
                count +=1;

                if(count == 8){
                    count = 0;
                }
            }

        }

        return map;
    }

    public static String octopusString(String sentence){

        StringBuffer stringBuffer = new StringBuffer();
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sentence.length(); i++) {
            Character character ='\0';
            character = sentence.charAt(i);

            if(count < 8 && character != '\0'){
                if(!map.containsKey(character)){
                    map.put(character, 1);
                    stringBuffer.append(character);
                }else{
                    int tempKey = map.get(character);
                    tempKey +=1;
                    map.replace(character,tempKey);
                    stringBuffer.append('*');
//                map.put('*',1);
                }
                count +=1;

                if(count == 8){
                    count = 0;
                    map.clear();
                }
            }

        }

        return stringBuffer.toString();
    }


    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {

        int cakes = Integer.MAX_VALUE;


        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {

            String ingredients = entry.getKey();
            int quantity = entry.getValue();

            if(!available.containsKey(ingredients)){
                    return  0;
                }

                cakes = Math.min(cakes, available.get(ingredients)/ quantity );
            }

            return cakes;
        }
    }




