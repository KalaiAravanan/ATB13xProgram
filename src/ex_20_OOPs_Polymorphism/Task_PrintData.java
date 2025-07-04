package ex_20_OOPs_Polymorphism;

public class Task_PrintData {
    public static void main(String[] args) {
        /*•	Description: Polymorphism,Overloading - Create a class Printer with multiple printData() methods to handle different data types:
            o	printData(String data)
            o	printData(int data)
            o	printData(float data)
            Demonstrate in the main() method how the same method name behaves differently depending on the parameter type. */

        PrintMethods pms = new PrintMethods();
        pms.printData(10);
        pms.PrintData(12.3f);
        pms.printData("Hello");
    }
}

class PrintMethods{
    void printData(int data){
        System.out.println("Print Int Data: " + data);
    }

    void PrintData(float data){
        System.out.println("Print Float Data: " + data);
    }

    void printData(String data){
        System.out.println("Print String Data: " + data);
    }

}