package ex_32_CollectionFramework_DSA;

import java.util.*;

public class Task_FilterStudents_ByName_StartingWith_A {
    public static void main(String[] args) {
        /* 📘 Description: Store roll numbers and names in a HashMap, print only those starting with 'A'.
              Input: {101="Anjali", 102="Dipak", 103="Aman", 104="Ravi"}
              Output:
              101 -> Anjali
              103 -> Aman  */

        // Step 1: Create and populate the HashMap
        Map<Integer,String> studentMap = new HashMap<>();
        studentMap.put(101,"Anjali");
        studentMap.put(102,"Dipak");
        studentMap.put(103,"Aman");
        studentMap.put(104,"Ravi");

        // Step 2: Filter and print names starting with 'A'
        for(Map.Entry<Integer,String> entry : studentMap.entrySet()){
            if(entry.getValue().startsWith("A")){
                System.out.println(entry.getKey() + " : " +entry.getValue());
            }
        }
    }
}
