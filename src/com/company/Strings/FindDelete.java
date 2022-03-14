package com.company.Strings;
import java.util.*;
/*
Suppose you want to implement the ‘search and replace’ functionality in a string-based document.
You are given a string, and you are required to find and delete the sub-string that is given.
You need not input or output anything. You just need to complete the function Delete().
You will be provided with the string input and the string to be deleted.
Input: Hiwhatareyoudoingandjhowtodeletetheword, delete
Output: Hiwhatareyoudoingandjhowtothewor
Explanation: Here, Hiwhatareyoudoingandjhowtodeletetheword is the input string,
and the substring to be deleted from the input string is delete.
Note: The sub-string to be deleted will occur only once in the string.
 */
public class FindDelete {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String inputstring = scanner.next();
            String wordtodelete = scanner.next();

            System.out.println(Delete(inputstring,wordtodelete));

        }
   public static String Delete(String inputstring, String wordtodelete) {

       //complete the function here
       //System.out.println(inputstring.equals(wordtodelete));
       inputstring=inputstring.replace(wordtodelete,"" );
       return inputstring;
   }
}


