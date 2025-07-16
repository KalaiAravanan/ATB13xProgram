package ex_32_CollectionFramework_DSA;

import java.util.*;

public class Map_Task_Character_Frequenct_Counter_Hashmap {
    public static void main(String[] args){
    /* Program: Character Frequency Counter
    📘 Description:
    Count how many times each character appears in a string using HashMap.
    Input:
    "aabbccddeeff"
    Output:
    a -> 2
    b -> 2
    c -> 2
    d -> 2
    e -> 2
    f -> 2  */

        Map<Character, Integer> map = new HashMap<>();
        String Input = "aabbccddeeff";

        for(char c: Input.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        System.out.println(map);
    }
 }

