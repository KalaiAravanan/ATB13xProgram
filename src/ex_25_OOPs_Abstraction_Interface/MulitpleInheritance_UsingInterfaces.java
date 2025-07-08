package ex_25_OOPs_Abstraction_Interface;

public class MulitpleInheritance_UsingInterfaces {
    public static void main(String[] args) {
        /* 🔶 Objective:
            Show how a class in Java can implement multiple interfaces to achieve multiple inheritance.
            🔶 Steps:
            1.	Create two interfaces: Printable and Showable.
            2.	Each interface should have a method: print() and show() respectively.
            3.	Create a class Document that implements both interfaces.
            4.	Implement both methods in the Document class.
            5.	In the main() method, create a Document object and call both methods.
            🔶 Expected Output:
            Printing Document
            Showing Document */

        document dc = new document();
        dc.print();
        dc.show();
    }
}

class document implements Printables,Showables{
    @Override
    public void print(){
        System.out.println("Printing document");
    }
    @Override
    public void show(){
        System.out.println("Showing document");
    }
}

interface Printables{
    void print();
    void show();
}

interface Showables{
    void print();
    void show();
}