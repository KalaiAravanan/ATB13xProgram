package ex_32_CollectionFramework_DSA;

import java.util.*;

public class Task_FindMostFrquent_Character_In_String {
    public static void main(String[] args) {
        /* Program: Find Most Frequent Character in String
           📘 Description:
            Count frequency of characters and find the one with the highest count.
            Input: "aaaabbbcc"
            Output: Most frequent character is: a (4 times) */

        String Input = "aaaabbbcc";

        // HashMap to store frequency of characters
        HashMap<Character,Integer> charMap = new HashMap<>();

        // Count frequency of each character
        for(char c: Input.toCharArray()){
            charMap.put(c,charMap.getOrDefault(c,0)+1);
        }

        // Variables to store the most frequent character and its count
        char mostFrequentChar = ' ';
        int maxCount = 0;

        for(Map.Entry<Character,Integer> entry : charMap.entrySet()){
            if(entry.getValue() > maxCount){
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }
}
