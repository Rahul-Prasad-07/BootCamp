package com.company.StringBuilder;

public class McQ {
    public static void main(String[] args) {


        int i1 = 9;
        int i2 = 11;
        String s3 = String.valueOf(i1) + String.valueOf(i2); //911
        int i3 = i1 + i2; //9+11
        s3 = s3 + i3; //911+20
        System.out.println(s3);
    }

}
