package ex_32_CollectionFramework_DSA;
import java.util.*;

public class List_252_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.add("python");
        s1.add("c#");
        s1.add("Java");

        System.out.println(s1); //displays values in stack
        System.out.println(s1.peek()); //find an elemeent
        System.out.println(s1.pop()); //deletes an element
        System.out.println(s1);

        // Create Integer type stack
        Stack<Integer> intStack = new Stack<>();

        // Create String type stack
        Stack<String> stringStack = new Stack<>(); //new stack created
        intStack.push(23); //adds an item to the element
        intStack.push(43);
        intStack.push(53);
        System.out.println(intStack);
    }
}
