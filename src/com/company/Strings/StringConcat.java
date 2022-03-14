package com.company.Strings;

import java.util.Scanner;

/*
Suppose you have to send a welcome email to every student registering at your college.
A student would have free access to your website until he/she graduates four years after his/her enrolment.
The welcome message is as follows: Hello <name>,Free services till:<year of graduation>
You must take the username and year of enrolment as the input from the user and
generate the welcome message as the output.
Note: The code for taking the name and year of enrolment has already been written for you.
Sample input:
Aishwarya
2010
Sample output:
Hello Aishwarya
Free services till:2014
 */
public class StringConcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int year  = sc.nextInt();
        year += 4;

        System.out.println("Hello" +" "+ name);
        System.out.println("Free services till:" + year);


    }

}
