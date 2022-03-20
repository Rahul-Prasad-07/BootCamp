package com.company.MultithredingLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Description :Given a list of integer numbers, filter out the odd numbers.
Input:6
1 2 3 4 5 6
Output:2 4 6
Explanation: The odd numbers 1, 3 and 5 are filtered out leaving only even numbers.
Input: 5
5 1 92 18 51
Output
92 18
 */
public class OddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            numbers.add(sc.nextInt());
        }
        printEvenNumbers(numbers);
        //List<Integer> even = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
    }
    public static void printEvenNumbers(List<Integer> numbers) {
        // List<Integer> s = new ArrayList<>();
        List<Integer> even = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        // for printing in new line without array
        for (int i = 0; i < even.size(); i++) {
            System.out.println(even.get(i) + " ");
        }
    }
}

