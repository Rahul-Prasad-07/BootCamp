package com.company.StringBuilder;

import java.util.Arrays;

// Q=in HelloWorld we have to find the most frequent character?
// first we declare and initialized string  helloworld.
//creat int array of 26 for Abcd…z(26).
// run for loop for helloworld upto size of length.
//chr ch = s.charAt(i); then int index = convert(ch); freq[index]++;--> creat another public static class for
// convert char & return ch-'a'; will store the char at index in array
// for find run loop int =0 to 26-->int max=0; index=-1; if condition (freq[i]>max{max=freq[i];index[i];}
public class findFrequant {
    public static int convert(char ch){
        return ch-'a';
        //ch = c(99) 'a'=97
        //ch-'a' =99-97=2
    }
    public static char unconverted (int index){
        return (char) (index+97);  // this class is for convert asscii value in string by adding 97(a), we have cast it ny (char).
    }
    public static void main(String[] args) {
        String s = "helloworld";
        int[] freq = new int[26];
        for (int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int index =convert(ch);
            freq[index]++;
        }
        int max =0, index=-1;
        for (int i=0; i<26; i++){
            if(freq[i]>max){
                max=freq[i];
                index=i;
            }
        }
        System.out.println("ans : " + unconverted(index)); // print object:calling unconverted class for print "l".
        System.out.println(Arrays.toString(freq));//to print array of repeated char.
    }

}
