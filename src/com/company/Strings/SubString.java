package com.company.Strings;

import java.util.Scanner;
import java.util.*;

public class SubString {


    public static void main(String[] args) {

        //write the code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str, str.length());
    }

    public static void SubString(String str, int n) {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)

                // Please refer below article for details
                // of substr in Java
                // https://www.geeksforgeeks.org/java-lang-string-substring-java/
                System.out.print(str.substring(i, j) + " ");
    }
}

