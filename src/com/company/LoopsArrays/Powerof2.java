package com.company.LoopsArrays;
import java.util.Scanner;

public class Powerof2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // Enter the number
            int number = scan.nextInt();
            int result = 1;
            if(number >= 2) {

                while (result * 2 <= number) {
                    result = result * 2;
                }

                System.out.print(result);

            } else {
                System.out.print("Please enter an integer >= 2");
            }

            scan.close();
        }
    }


