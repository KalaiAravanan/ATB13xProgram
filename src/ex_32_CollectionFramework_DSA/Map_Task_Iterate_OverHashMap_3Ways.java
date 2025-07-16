package ex_32_CollectionFramework_DSA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map_Task_Iterate_OverHashMap_3Ways {
    public static void main(String[] args) {
        /*2. Program: Iterate Over HashMap in Three Ways
             📘 Description:
             Create a map with key-value pairs and iterate using:
            •	entrySet()
            •	keySet()
            •	Iterator
            Input: {"Name" -> "Dipak", "Role" -> "Tester", "Level" -> "Senior"}
            Output
            Name -> Dipak
            Role -> Tester
            Level -> Senior */

        Map<String, String> map = new HashMap<>();
        map.put("Name", "Dipak");
        map.put("Role", "Tester");
        map.put("Level", "Senior");

        System.out.println("Iteration using entrySet():");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Iteration using keySet():");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " -> " + value);
        }

        System.out.println("Iteration using Iterator:");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}


