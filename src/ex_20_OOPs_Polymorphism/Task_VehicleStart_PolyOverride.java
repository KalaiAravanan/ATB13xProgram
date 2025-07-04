package ex_20_OOPs_Polymorphism;

import org.w3c.dom.ls.LSOutput;

public class Task_VehicleStart_PolyOverride {
    public static void main(String[] args) {
        /*•	Description: Create a base class Vehicle with a method start().
            Create Bike and Car classes that override the start() method:
            o	Bike prints "Kick start the bike"
            o	Car prints "Turn the key to start the car"
            This shows how polymorphism works with method overriding. */

        Vehicle vl = new Vehicle();
        vl.start();
        Bike be = new Bike();
        be.start();
        Car cr = new Car();
        cr.start();

    }
}

class Vehicle {
    void start() {
        System.out.println("Start the vehicle");
    }
}
class Bike extends Vehicle {
    void start() {
        System.out.println("Start the bike");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Put the Key,Start the Car");
    }
}