package com.company.CollectionFramework;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        // Declaring arraylist without any initial size
        ArrayList<Integer> inputlist =  new ArrayList<>();
        for(int i=0; i<size;i++)
            inputlist.add(scanner.nextInt());

        ArrayList<Integer> list =  reverseArrayList(inputlist);

        System.out.println(list);

    }

    private static ArrayList<Integer> reverseArrayList(ArrayList<Integer> inputlist) {


        Collections.reverse(inputlist);
        return inputlist;


    }
}
