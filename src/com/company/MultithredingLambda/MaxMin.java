package com.company.MultithredingLambda;
import java.sql.SQLOutput;
import java.util.*;

/* Description
Given a list of integers, calculate the maximum, minimum and the sum of all numbers in the list
Test cases:Input:
6
1 2 3 4 5 6
Output: 6
1 21
Input:5
5 1 7 9 51
Output: 51 1 73 */

public class MaxMin {
    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            numbers.add(sc.nextInt());
        }
        printArrayStats(numbers);
    }
    public static void printArrayStats(List<Integer> numbers){
        // Get the maximum number
        // Get the minimum number
        // get the sum of all numbers
        // Print maxNumber, minNumber & sum in that order

         int maxList = Collections.max(numbers);
        System.out.println(maxList);
         int min = Collections.min(numbers);
        System.out.println(min);

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


    }
}

    // function return maximum value in an unsorted & list in Java using Collection


