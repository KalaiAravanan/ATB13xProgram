package ex_20_OOPs_Polymorphism;

public class Task_Add2Numbers_PolymoOverLoading {
    public static void main(String[] args) {
        /*•	Description: Polymorphism,Overloading - Create a class Calculator with two overloaded methods add(int a, int b) and add(double a, double b).
            o	The int version should add two integers.
            o	The double version should add two decimal numbers.
            In the main method, call both versions to demonstrate how overloading works with data types.*/

        Calculator calc = new Calculator();
        System.out.println(calc.Add(22,12));
        System.out.println(calc.Add(22.3,30.6));
    }
}

class Calculator{
    int Add(int a, int b){
        System.out.println("Addition - Integer");
        return(a+b);
    }
    double Add(double a, double b){
        System.out.println("Addition - Double");
        return(a+b);
    }

}
