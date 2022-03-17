package com.company.Problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrangeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputstring = scanner.next();
        System.out.println(ArrangeString(inputstring));
    }
    public static String ArrangeString(String inputstring){
        char arr [] = inputstring.toCharArray();
        //You are required to arrange the alphabetical characters in ascending order
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
