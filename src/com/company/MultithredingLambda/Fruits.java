package com.company.MultithredingLambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Description: You have been provided with a list of fruit names.
Calculate the count of every fruit in the list.
Testcase:Input:9
mango apple grapes berry berry mango apple apple banana.
Output:
{banana=1, apple=3, berry=2, grapes=1, mango=2}
 */
public class Fruits {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-->0){
            fruits.add(sc.next());
        }
        printFruitCount(fruits);
    }
    public static void printFruitCount(List<String> fruits){

        // Group by a List and display the total count of it
        Map<String,Long> result = fruits.stream().sorted()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);



    }
}
