package com.company.Oop2;
import java.util.*;

public class LargestDifference {


        public static void main (String[]args)
        {
            Scanner scanner = new Scanner (System.in);
            int size = scanner.nextInt ();
            int arr[] = new int[size];

            for (int i = 0; i < size; i++)
                arr[i] = scanner.nextInt ();

            System.out.println (FindMaxDiff (arr));

        }

        static int FindMaxDiff (int arr[])
        {
            Arrays.sort(arr);
            return arr[arr.length-1] - arr[0];
        }
    }


