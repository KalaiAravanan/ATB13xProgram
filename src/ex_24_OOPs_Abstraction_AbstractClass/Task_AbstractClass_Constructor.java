package ex_24_OOPs_Abstraction_AbstractClass;

public class Task_AbstractClass_Constructor {
    public static void main(String[] args) {
        /*•	Description: Show that abstract class can have constructor. Print message from constructor and method.
            🔶Expected Output:
             Abstract class constructor called
             Method from abstract class */

            children pt = new children();
            pt.parents();
            pt.print();
    }
}


abstract class parents{

    void parents(){
        System.out.println("Abstract class constructor called");
    }

    abstract void print();
}

class children extends parents{

    void print(){
        System.out.println("Method from abstract class");
    }
}