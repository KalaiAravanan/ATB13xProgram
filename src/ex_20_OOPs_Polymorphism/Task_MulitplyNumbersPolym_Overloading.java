package ex_20_OOPs_Polymorphism;

public class Task_MulitplyNumbersPolym_Overloading {
    public static void main(String[] args) {
        /*•	Description: Polymorphism,Overloading - Create a class MathOperations with two multiply() methods:
            o	One takes two integers and returns the product
            o	Another takes three integers and returns their product
            This helps students understand how Java distinguishes methods based on parameter count. */
        MulitpleNumbers mn =  new MulitpleNumbers();
        int c = mn.Multiply(10,5);
        int d = mn.Multiply(12,3,5);
        System.out.println("Multiply 2 Numbers:" +c);
        System.out.println("Multiply 3 Numbers:" +d);
    }
}

class MulitpleNumbers{
    int Multiply(int a, int b){
        return a*b;
    }

    int Multiply(int a, int b, int c){
        return a*b*c;
    }
}

