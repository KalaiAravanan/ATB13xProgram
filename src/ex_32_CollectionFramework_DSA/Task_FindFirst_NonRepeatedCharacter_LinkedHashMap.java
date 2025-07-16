package ex_32_CollectionFramework_DSA;
import java.util.*;
public class Task_FindFirst_NonRepeatedCharacter_LinkedHashMap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String Input = "aabbccdeeff";

        // Step 1: Count frequency of each character
        for (char c : Input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find the first character with frequency 1
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return; // Exit after finding the first
            }
        }

        // If no such character
        System.out.println("No unique character found.");
    }
}
