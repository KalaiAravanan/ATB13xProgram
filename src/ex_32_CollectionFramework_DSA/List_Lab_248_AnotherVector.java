package ex_32_CollectionFramework_DSA;

import java.util.*;
public class List_Lab_248_AnotherVector {
    public static void main(String[] args) {
        Vector<String> vr1 = new Vector<>();
        vr1.add("item1");
        vr1.add("item2");
        vr1.add("item3");
        vr1.add("item4");

        /* ListIterator listIter = vr1.listIterator();
        while(listIter.hasNext()){
            System.out.println(listIter.next());
        } */

        Iterator iterator = vr1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
