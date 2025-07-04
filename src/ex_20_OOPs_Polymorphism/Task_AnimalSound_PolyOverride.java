package ex_20_OOPs_Polymorphism;

public class Task_AnimalSound_PolyOverride {
    public static void main(String[] args) {
        /* Create a base class Animal with a method sound().
           Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
           Create an object of each class and call sound() to see how overriding provides different outputs using the same method name.*/

        Animal al =  new Animal();
        al.sound();
        Dog dg = new Dog();
        dg.sound();
        Cat ct = new Cat();
        ct.sound();
        Cow cw = new Cow();
        cw.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class  Dog extends Animal{
    void sound(){
        System.out.println("Bark");
    }
}

    class  Cat extends Animal {
        void sound() {
            System.out.println("Meow");
        }
    }

    class  Cow extends Animal {
        void sound() {
            System.out.println("Moo");
        }
    }