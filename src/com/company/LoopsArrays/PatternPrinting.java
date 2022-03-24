package com.company.LoopsArrays;
import java.util.*;
import java.io.*;

public class PatternPrinting {
        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            for (int i=0; i<n; i++)
            {
                for (int j=n-i; j>1; j--)
                    System.out.print(" ");

                for (int j=0; j<=i; j++ )
                    System.out.print("* ");

                System.out.println();
            }
        }
    }


