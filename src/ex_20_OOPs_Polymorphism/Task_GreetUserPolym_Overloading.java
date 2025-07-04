package ex_20_OOPs_Polymorphism;

public class Task_GreetUserPolym_Overloading {
    public static void main(String[] args) {
        /*•	Description: Create a class Greeter with the following methods:
            o	greet() – prints "Hello!"
            o	greet(String name) – prints "Hello, [name]!"
            This task teaches overloading based on the number of parameters. */
        Greeter gt = new Greeter();
        gt.greet();
        gt.greet("Kalai");
    }
}

class Greeter{
    void greet(){
        System.out.println("Hello");
    }
    void greet(String name){
        System.out.println("Hello " +name);
    }
}
