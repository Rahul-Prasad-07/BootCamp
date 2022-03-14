package com.company.Strings;
import java.util.*;
public class reverse {
    public static String reverse (String str){
        //write your code here
            for(int i=str.length()-1; i>=0; i--){
                System.out.println(str.charAt(i));
            }
            return St;
        }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }
}