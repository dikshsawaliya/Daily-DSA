package com.company;


import java.util.HashMap;
import java.util.Map;

public class Playground {

    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.insertFirst(3);
//        linkedList.insertFirst(4);
//        linkedList.insertFirst(5);
//        linkedList.insertLast(10);
//        linkedList.display();

//        Map <String, Integer> recipe = new HashMap<>();
//        recipe.put("flour", 500 );
//        recipe.put("sugar", 200 );
//        recipe.put("eggs", 800 );
//
//        Map <String, Integer> available = new HashMap<>();
//        available.put("sugar", 200 );
//        available.put("eggs", 800 );
//        available.put("flour", 500 );
//
//        System.out.println(cakes(recipe, available));


        System.out.println(octopus("    "));
        System.out.println(octopusString("    "));

// must return 0

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




