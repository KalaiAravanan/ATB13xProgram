package ex_32_CollectionFramework_DSA;

import java.util.HashMap;
import java.util.Map;

public class Map_Task_WordFrequency_Using_HashMap {
    public static void main(String[] args) {
        /* 1. Program: Word Frequency Counter Using HashMap
           📘 Description:
           Takes a sentence and prints how many times each word appears using HashMap.
           Input: "java is easy and java is powerful"
           Output:
           java -> 2
           is -> 2
           easy -> 1
           and -> 1
           powerful -> 1 */

        String input = "java is easy and java is powerful";

        Map<String, Integer> tempMap = new HashMap<>();
        String[] words = input.split(" ");

        for (String word : words) {
            tempMap.put(word, tempMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(tempMap);


    }

}
