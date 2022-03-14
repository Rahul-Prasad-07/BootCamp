package com.company.ExceptionHandling;

/*Suppose you are performing X/Y operations, where X and Y are integers.
You are required to enclose the operations in a try-catch block to ensure
that you catch the divide by 0 and the Input mismatch exception. You must implement a try-catch-catch block where,
in case of an Input mismatch exception, the output is “Wrong Input” and where,
in case of divide by 0, the output is “Divide by 0 error”. In case there is no error,
try block should print the integer value of “X/Y”.Input: X = 20, Y = 0 */

import java.util.InputMismatchException;
import java.util.Scanner;



public class HandleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int divide;
            divide =X/Y;
            System.out.println(divide);
        }catch(ArithmeticException e) {
            System.out.println("Divide by 0 error");
        }
        catch(InputMismatchException e) {
            System.out.println("Wrong input");
        }


    }
}
