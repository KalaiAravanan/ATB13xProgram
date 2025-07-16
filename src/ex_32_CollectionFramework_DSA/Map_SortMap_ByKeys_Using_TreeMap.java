package ex_32_CollectionFramework_DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_SortMap_ByKeys_Using_TreeMap {
    public static void main(String[] args) {
        /* . Program: Sort Map by Keys Using TreeMap
             📘 Description:
             Store data in HashMap, then transfer to TreeMap to sort by keys.
             Input: {"Ravi": 80, "Anjali": 95, "Dipak": 75}
             Output:
             Anjali = 95
             Dipak = 75
             Ravi = 80 */


        HashMap<String,Integer> marksMap = new HashMap<>();
        marksMap.put("Ravi",80);
        marksMap.put("Anjali",95);
        marksMap.put("Dipak",75);

        TreeMap<String,Integer> sortMap = new TreeMap(marksMap);

        for(Map.Entry<String,Integer> entry : sortMap.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
