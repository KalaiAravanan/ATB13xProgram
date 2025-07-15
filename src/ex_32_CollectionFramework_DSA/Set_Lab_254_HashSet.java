package ex_32_CollectionFramework_DSA;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_Lab_254_HashSet {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts  = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod");
        hs.add("Dutta");
        System.out.println(hs);
    }
}
