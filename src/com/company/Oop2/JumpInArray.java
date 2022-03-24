package com.company.Oop2;
import java.util.*;

public class JumpInArray {


        public static void main (String[]args)
        {
            Scanner scanner = new Scanner (System.in);
            int size = scanner.nextInt ();
            int arr[] = new int[size];

            for (int i = 0; i < size; i++)
                arr[i] = scanner.nextInt ();

            System.out.println (CanReach (arr));
        }

        static boolean CanReach (int arr[])
        {
            int run = 0;

            for (int i = 0; i < arr.length; i++)
            {

                if (run >= arr.length - 1)
                    return true;
                run = run + arr[run];

            }

            if (run >= arr.length - 1)
                return true;

            return false;
        }
    }


