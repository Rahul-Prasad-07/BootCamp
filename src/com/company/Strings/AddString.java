package com.company.Strings;
import java.util.*;

public class AddString {


        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String inputstring = scanner.next();
            System.out.println(Add(inputstring));

        }

        public static int Add(String inputstring) {

   //      String temp = "0";
   //      int sum =0;
   //      for (int i=0; i<inputstring.length(); i++){
   //          char ch = inputstring.charAt(i);
   //
   //          if(Character.isDigit(ch))
   //              temp +=ch;
   //
   //          else {
   //              //increment sum by found earlier
   //              //(if any)
   //              sum += Integer.parseInt(temp);
   //
   //              // reset temporary string to empty
   //              temp = "0";
   //          }
   //      }
   //      return sum + Integer.parseInt(temp);
   //
   //  }
            int l = inputstring.length();
            int sum = 0;
            for (int i = 0; i < l; i++)
            {
                if (Character.isDigit(inputstring.charAt(i)))
                {
                    String tmp = inputstring.substring(i,i+1);
                    sum += Integer.parseInt(tmp);
                }
            }
            return sum;
        }
}
