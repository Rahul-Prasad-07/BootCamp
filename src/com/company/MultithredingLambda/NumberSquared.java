package com.company.MultithredingLambda;

/*Description
Given a list of integer numbers, print the square of every number
Test cases:Input:0,Output:(No output)
Input:6
1 2 3 4 5 6
Output:
1 4 9 16 25 36 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberSquared {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            numbers.add(sc.nextInt());
        }
        printSquareNumbers(numbers);
    }
    public static void printSquareNumbers(List<Integer> numbers){
        //print every number's square in the same order of array
        List<Integer> square =numbers.stream().map((i)->i*i).collect(Collectors.toList());
        // each in new line
        for (int i = 0; i < square.size(); i++) {
            System.out.println(square.get(i) + " ");
        }
    }

}
