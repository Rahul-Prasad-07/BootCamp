package com.company.CollectionFramework;
import java.util.*;

public class CountUnique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        //You are given an arraylist of integers.
        ArrayList<Integer> inputlist = new ArrayList<>();

        for (int i = 0; i < size; i++)
            inputlist.add(scanner.nextInt()); // store element in inputlist
        System.out.println(CountUnique(inputlist));
    }

    public static int CountUnique(ArrayList<Integer> inputlist) {

        //complete the function and
        // return the integer as the number of unique elements in arraylist.
        HashSet<Integer> hset = new HashSet<Integer>(inputlist);
        //System.out.println("ArrayList Unique Values is : " + hset);
        return hset.size();
    }
}
