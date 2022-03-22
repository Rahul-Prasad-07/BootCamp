package com.company.MultithredingLambda;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*Description
Given a list of sentences, get the count of every word present in the sentence.
The words should be considered the same irrespective of the casing of the letters.
This means ‘Count’ and ‘count’ should be treated as the same word. Print the words in lowercase letters.
TestCase:Input: No input
Output: {however=1, a=1, be=1, memory=2, began=1, will=1, might=1, work=1, count=2, i=2, disappear=1,
 your=1, my=1, three=1, we=1, required=1, can=1, difficulties=1, by=1, know=1, to=2, on=1, little=3}*/

public class WordCount {

        public static void main(String[] args){
            List<String> sentences = Arrays.asList(
                    "A little memory work might be required",
                    "I know we can count on your memory",
                    "I will count to three",
                    "Little by little however my difficulties began to disappear");

            Map<String, Long> wordCounts = sentences.stream().flatMap(s -> Stream.of(s.toLowerCase().split(" ")))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            System.out.println(wordCounts);
        }
    }
