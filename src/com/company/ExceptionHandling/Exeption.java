package com.company.ExceptionHandling;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedReader;

public class Exeption {
        public static void main(String[] args) throws IOException {
            // Enter a string in the input console
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

            String inData;
            inData = stdin.readLine();
            try {
            System.out.println("You wrote:" + inData);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}
