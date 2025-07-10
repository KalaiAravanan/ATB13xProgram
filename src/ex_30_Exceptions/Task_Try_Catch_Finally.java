package ex_30_Exceptions;

public class Task_Try_Catch_Finally {
    public static void main(String[] args) {
        /*📘 Description:  Create a program with a try, a catch, and a finally block.
          Demonstrate that the finally block always executes. */

        int a = 0;

        try {
            int b = a / 0;
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
            System.out.println("Divide by Zero error");
        }
            finally {
            System.out.println("Finally block of code executed");
        }

    }
}
