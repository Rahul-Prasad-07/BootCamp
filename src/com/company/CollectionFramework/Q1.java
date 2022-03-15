package com.company.CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        for(int i=0; i<=10; i++)
            list.add(i+"");

        int initial = list.size();
        list.clear();
        int finall = list.size();

        System.out.println(initial - finall);
    }

}


