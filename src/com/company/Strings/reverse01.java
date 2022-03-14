package com.company.Strings;
import java.util.*;



public class reverse01 {
     public static String reverse(String str){
         return new StringBuilder(str).reverse().toString();
     }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse(str));
    }


}
/*
package Edureka;
import java.util.*;
public class StringReverse{
public static void main(String args[]) {
String initial, rev="";
Scanner in=new Scanner(System.in);
System.out.println("Enter the string to reverse");
initial=in.nextLine();
int length=initial.length();
for(int i=length-1;i>=0;i--)
  rev=rev+initial.charAt(i);
System.out.println("Reversed string: "+rev);
}
}


2)
package Edureka;
import java.util.*;
public class StringRev{
 // Function to reverse a string in Java using StringBuffer
public static String rev(String s){
return new StringBufferr(s).reverse().toString();
}
public static void main(String[] args){
String s= "Welcome to Edureka";
// Note that string is immutable in Java
 s= rev(s);
System.out.println("Result after reversing a string is : "+s);
}
}

3)
package Edureka;
import java.util.*;
public class StringRev{
// Function to reverse a string in Java
public static String reverseString(String s){
//Converting the string into a character array
char c[]=s.toCharArray();
String reverse="";
//For loop to reverse a string
for(int i=c.length-1;i>=0;i--){
reverse+=c[i];
}
return reverse;
}

public static void main(String[] args) {
System.out.println(reverseString("Hi All"));
System.out.println(reverseString("Welcome to Edureka Blog"));
}
}

4)
package Edureka;
import java.util.*;
public class StringRecursion{
String rev(String str) {
if(str.length() == 0)
return " ";
return str.charAt(str.length()-1) + rev(str.substring(0,str.length()-1)); }
public static void main(String[ ] args) {
StringRecursion r=new StringRecursion();
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string : ");
String s=sc.nextLine();
System.out.println("Reversed String: "+r.rev(s)); }
}

5)
package Edureka;
public class stringreverse {
public static void main(String[] args) {
// TODO Auto-generated method stub
String str = "Welcome To Edureka";
String[] strArray = str.split(" ");
for (String temp: strArray){
System.out.println(temp);
}
for(int i=0; i<3; i++){ char[] s1 = strArray[i].toCharArray(); for (int j = s1.length-1; j>=0; j--)
{System.out.print(s1[j]);}
System.out.print(" ");
}
}
 */
