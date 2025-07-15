package ex_32_CollectionFramework_DSA;

import java.util.ArrayList;
import java.util.Iterator;

public class List_Lab_249_NestedArrayList {
    public static void main(String[] args) {
        ArrayList fruits = new ArrayList();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");

        ArrayList vegtables = new ArrayList();
        vegtables.add("Turnip");
        vegtables.add("Beans");
        vegtables.add("Cauliflower");

        ArrayList grocery = new ArrayList();
        grocery.add(fruits);
        grocery.add(vegtables);

        Iterator iterator = grocery.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
