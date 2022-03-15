package com.company.CollectionFramework;

import java.util.*;


public class DistinctValues {
    //Method to print distinct values
    public static void printValues(Map<Integer,String> map){
        //Write your code here
        //The output should print the distinct values of HashMap,
        // separated by spaces.

        Set<String> set = new HashSet<>();
        for(String value: map.values()){
            set.add(value);
        }
        for (String s: set){
            System.out.print(s + " ");
        }
    }
    public static void main(String[] x){
        Map<Integer,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int key;
        String value;
        for(int i = 1; i <= num; i++){
            key = sc.nextInt();
            value = sc.next();
            map.put(key,value);
        }
        printValues(map);
    }

}
