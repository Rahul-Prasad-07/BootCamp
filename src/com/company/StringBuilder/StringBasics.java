package com.company.StringBuilder;

import java.util.Locale;

public class StringBasics {
   public static void main(String[] args) {
       char [] ch = {'a', 'b', 'c', 'd','e'};
       StringBuilder sb = new StringBuilder();
       for (int i=0; i<ch.length; i++){
           sb.append(ch[i]);
          // System.out.println(sb.toString()); // a,ab,abc,abcd,abcde
           // note: default capacity of String builder is 16.and we can set our own capacity also.load factor is const around 0.7.
       }
       sb.setCharAt(4,'f'); //changing the element in ch array
       System.out.println(sb.charAt(0)); // read element and print at location
       String s = sb.toString();
       System.out.println(s);
   }
}

//String Builder vs String buffer reader
//string buffer is thread safe,,,where String builder is not thread safe.why?
// bcz buffer is synchronize(waiting for response before next task)where builder is asynchronize.
