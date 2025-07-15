package ex_32_CollectionFramework_DSA;
import java.util.*;

public class List_Lab_245_LinkedList {
    public static void main(String[] args) {
        LinkedList animalslist = new LinkedList<String>();
        animalslist.add("Dog");
        animalslist.add("Cat");
        animalslist.add("Elephant");
        animalslist.add("Lion");
        System.out.println("Animals: " + animalslist);

        animalslist.removeFirst();
        System.out.println("Removed First:" +animalslist);

        animalslist.removeLast();
        System.out.println("Removed Last: " +animalslist);
    }
}
