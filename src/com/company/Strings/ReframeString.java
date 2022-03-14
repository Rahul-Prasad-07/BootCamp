package com.company.Strings;
import java.util.*;
/*You are given a string as the input.
You are required to convert the entire string,
except for the first alphabet, to lowercase.
The first character (i.e., the alphabet) should be uppercase.
You must take the string input and print the converted string.
Input: hihowisTheHeLLoWoRLd
Output: Hihowisthehelloworld
*/

    public class ReframeString {
        public static void main(String[] args) {
            //Take the input string, do the operation and print the string.

            Scanner scanner = new Scanner(System.in);
            String convert = scanner.next();
            String firstLetter = convert.substring(0, 1);
            String remainingLetters = convert.substring(1, convert.length());

            // change the first letter to uppercase
            firstLetter = firstLetter.toUpperCase();
            remainingLetters = remainingLetters.toLowerCase();

            // join the two substrings
            convert = firstLetter + remainingLetters;
            System.out.println(convert);

            System.out.println(Arrays.toString(convert.toCharArray()));
            System.out.println(convert.charAt(0) +  convert.toLowerCase());
            System.out.println(convert);
            System.out.println(convert.indexOf('a'));
            System.out.println("     Kunal   ".strip());
            System.out.println(Arrays.toString(convert.split(" ")));
        }
    }



