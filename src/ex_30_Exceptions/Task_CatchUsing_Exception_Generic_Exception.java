package ex_30_Exceptions;

public class Task_CatchUsing_Exception_Generic_Exception {
    public static void main(String[] args) {
        /*📘 Description: Use only catch(Exception e) to catch any exception.
          Throw a NullPointerException or ArithmeticException inside try.*/

        int a=0;
    try {
            a = 10 / 0;//java.lang.ArithmeticException

        } catch (Exception e) {
            System.out.println("Divide by Zero is not allowed");
        }
        System.out.println(a);
    }
}

