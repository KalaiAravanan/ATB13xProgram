package ex_29_WrapperClass;

public class Task_Compare_equalsign_with_equals {
    public static void main(String[] args) {
        /*📘 Description:
        Compare two Integer objects using == and .equals() and print the results.
        Expected Output:
        a == b: true
        c == d: false
        a.equals(b): true
        c.equals(d): true */

        Integer a = 10, b= 10;
        Integer c = 200, d = 200;

        System.out.println(" a == b: " + (a == b));
        System.out.println(" c == d: " + (c == d));

        System.out.println("a.equals(b): " + a.equals(b));
        System.out.println("c.equals(d): " + c.equals(d));

    }
}
