package ex_19_OOPs_Inheritance;

public class Task_Vehicle_Chain {
    public static void main(String[] args) {
           /* 📄Description: Create a class Vehicle with a constructor that prints "Vehicle is ready".
                Create a class Bike that extends Vehicle and prints "Bike is ready" in its constructor.
                Create an object of Bike in the main method and observe constructor call order.*/
        Bike myBike = new Bike();
    }
}

class Vehicle{
    Vehicle(){
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{
    Bike(){
        System.out.println("Bike is ready");
    }
}