package com.company.Oop2;
;
import java.util.*;

import static java.util.Arrays.sort;

     public class MergeTwoArray {
         static int[] MergeArray(int[] arr1, int[] arr2) {
             //complete the function
             int n1 = arr1.length;
             int n2 = arr2.length;
             int[] arr3 = new int[n1 + n2];
             for (int i = 0; i < n1; i++) {
                 arr3[i] = arr1[i];
             }
             for (int i = 0; i < n2; i++) {
                 arr3[n1 + i] = arr2[i];
             }

             Arrays.sort(arr3);
             return arr3;
         }


        public static void main (String[]args) {
            Scanner scanner = new Scanner(System.in);
            int size1 = scanner.nextInt();

            int arr1[] = new int[size1];
            for (int i = 0; i < size1; i++)
                arr1[i] = scanner.nextInt();

            int size2 = scanner.nextInt();
            int arr2[] = new int[size2];
            for (int i = 0; i < size2; i++)
                arr2[i] = scanner.nextInt();

            int arr3[] = MergeArray(arr1, arr2);

            for (int i = 0; i < arr3.length; i++)
                System.out.print(arr3[i] + " ");

        }

    }

