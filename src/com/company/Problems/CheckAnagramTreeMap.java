package com.company.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CheckAnagramTreeMap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.println(isAnagram(s1,s2));

    }
    public static boolean isAnagram(String string1, String string2){
        //complete the function and return true or false
        // base case
        if (string1 == null || string2 == null) {
            return false;
        }

        // if X's length is not the same as Y's, they can't be an anagram
        if (string1.length() != string2.length()) {
            return false;
        }

        // create an empty map
        Map<Character, Integer> freq = new HashMap<>();

        // maintain a count of each character of `X` on the map
        for (char c: string1.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // do for each character `y` of `Y`
        for (char c: string2.toCharArray())
        {
            // if `y` is not found in the map, i.e., either `y` is not present
            // in string `X` or has more occurrences in string `Y`
            if (!freq.containsKey(c)) {
                return false;
            }

            // decrease the frequency of `y` on the map
            freq.put(c, freq.get(c) - 1);

            // if its frequency becomes 0, erase it from the map
            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }

        // return true if the map becomes empty
        return freq.isEmpty();
    }


}
