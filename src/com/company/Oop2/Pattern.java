package com.company.Oop2;

import java.util.Scanner;

public class Pattern {
    public static void main (String[]args){
    Scanner scanner = new Scanner (System.in);
    int n = scanner.nextInt ();

    Patternprint(n);
}

    static void Patternprint (int n)
    {
        //complete the function

        for (int i=1; i<=n; i++){
            for(int j=i; j<= 2*n; j++){
                System.out.println("*");
            }

        }
        System.out.println();

    }
}

