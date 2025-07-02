package ex_19_OOPs_Inheritance;

public class Task_AnimalSound_Simulator {
    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.meow();
        mycat.makesound();
    }
}

class Animal{
     void makesound(){
        System.out.println("Make sound - Fn in Animal class");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow - Fn in Cat class");
    }
}


