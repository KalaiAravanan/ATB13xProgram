package ex_22_AccessModifiers;

public class Task_Protected_Access_Modifiers {
    public static void main(String[] args) {
        /*  Demonstrate protected Access Modifier
            :- Learn how protected members behave in inheritance.
            📝 Instructions:
            1.	Create a class Animal with a protected method eat() that prints "Animal is eating".
            2.	Create a child class Dog that extends Animal.
            3.	Create a method doEat() in Dog class which calls eat() using inheritance.
            4.	In main(), create a Dog object and call doEat(). */

            Dog dg = new Dog();
            dg.doEat();
    }
}

class Animal{
    protected void eat(){
        System.out.println("Protected - Eat method");
    }
}

class Dog extends Animal{
    void doEat(){
       eat();
    }
}
