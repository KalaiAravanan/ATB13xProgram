package ex_32_CollectionFramework_DSA;

import java.util.*;

public class Task_Group_WordsBy_Length_Using_Map {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "fun", "cool", "Hi"};

        // Step 1: Create the map
        Map<Integer, List<String>> map = new HashMap<>();

        // Step 2: Process each word
        for (String word : words) {
            int length = word.length(); // Get length of the word

            // Step 3: If this length is not in the map, add a new list
            map.putIfAbsent(length, new ArrayList<>());

            // Step 4: Add word to the correct list
            map.get(length).add(word);
        }

        // Step 5: Print the map
        System.out.println("Grouped words by length:");
        System.out.println(map);
    }
 }
