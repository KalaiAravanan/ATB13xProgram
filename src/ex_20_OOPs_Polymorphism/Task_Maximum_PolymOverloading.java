package ex_20_OOPs_Polymorphism;

public class Task_Maximum_PolymOverloading {
    public static void main(String[] args) {
        /*•	Description: Create a class Utility with two methods named max():
            o	max(int a, int b) returns the larger of two integers
            o	max(int a, int b, int c) returns the larger of three integers
            o	max(double a, double b) returns the larger of two decimal values
            Add method calls in main() to compare different types. */

        MaximumCalculator mc = new MaximumCalculator();
        System.out.println(mc.max(13,45) + " is largest");
        mc.max(23,15,27);
        System.out.println(mc.max(12.2,32.8) + " is largest");
    }
}

class MaximumCalculator {
    int max(int a, int b) {
        return Math.max(a, b);
    }

    int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest.");
            return a;
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest.");
            return b;
        } else {
            System.out.println(c + " is the largest.");
            return c;
        }
    }

    double max(double a, double b){
        return Math.max(a,b);
    }

}