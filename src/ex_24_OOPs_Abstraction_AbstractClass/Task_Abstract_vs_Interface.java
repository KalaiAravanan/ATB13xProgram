package ex_24_OOPs_Abstraction_AbstractClass;

public class Task_Abstract_vs_Interface {
    public static void main(String[] args) {
    /* 🔶Objective: Understand how abstract classes can contain both abstract methods (which must be implemented in the subclass)
    and concrete methods (which can be used as-is).
    🔶Steps to Create:
        1.Create an abstract class Parent. 2.Define one abstract method void show().
        3.Define one concrete method void display() that prints a message.  4. Create a class Child that extends Parent.
        5.Implement the show() method inside Child.  6.In the main() method, create an object of Child and call both display() and show().
    🔶Expected Output:
        Concrete method in abstract class
        Abstract method implemented  */

        child cd = new child();
        cd.display();
        cd.show();
    }
}

abstract class parent{
    abstract void show();

    void display(){
        System.out.println("Concrete method in abstract class");
    }
}

class child extends parent{

    void show(){
        System.out.println("Abstract method implemented");
    }

}