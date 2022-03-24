package com.company.LoopsArrays;
import java.util.Scanner;

public class HighestCommonFactor {
        public static void main(String args[]) {
            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
            int num2 = scan.nextInt();

            int hcf=1;

            int a = num1;
            int b = num2;

            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }

            hcf = a;
            System.out.print(hcf);
            scan.close();
        }
    }


