package ex_24_OOPs_Abstraction_AbstractClass;

public class AbstractMethod_Implementation {
    public static void main(String[] args) {
        /*•	Description: Create an abstract class Animal with an abstract method makeSound(). Extend it in Dog and Cat.
        Expected Output:
        Dog barks
        Cat meows
        */

        Dog dg = new Dog();
        dg.makeSound();
        Cat al = new Cat();
        al.makeSound();
    }
}

abstract class animal{
    abstract void makeSound();
}

class Dog extends animal{
    void makeSound(){
        System.out.println("Dog Bark");
    }
}
class Cat extends animal{
    @Override
    void makeSound(){
        System.out.println("Cat meow");
    }
}