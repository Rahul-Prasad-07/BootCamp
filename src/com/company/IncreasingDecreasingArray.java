package com.company;
import java.util.*;

public class IncreasingDecreasingArray {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int arr[] = new int [3];

            for(int i=0; i<3; i++)
                arr[i] = input.nextInt();

            if(arr[0] < arr[1] && arr[1] < arr[2])
                System.out.println("The numbers entered are in increasing order");
            else if(arr[0]>arr[1] && arr[1]>arr[2])
                System.out.println("The numbers entered are in decreasing order");
            else System.out.println("The numbers are in neither in increasing order nor in decreasing order");



        }
    }

