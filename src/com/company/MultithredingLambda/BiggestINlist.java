package com.company.MultithredingLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Description
Find the biggest even number present in a list.
Note: It's guaranteed that there will always be an even number in the input.
 */
public class BiggestINlist {
    public static void main(String[] args){

        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            numbers.add(sc.nextInt());
        }
        printMaximumEven(numbers);
    }
    public static void printMaximumEven(List<Integer> numbers){
        int maxEven = numbers.stream().filter(x-> x%2==0).max(Integer::compareTo).get();

        System.out.println(maxEven);
    }

}
