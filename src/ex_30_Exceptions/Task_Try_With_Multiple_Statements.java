package ex_30_Exceptions;

public class Task_Try_With_Multiple_Statements {
    public static void main(String[] args) {
        /*📘 Description: Write multiple statements in a try block.
        Ensure if the first fails, the rest are not executed, and control goes to catch. */
        try {
            System.out.println("Inside try block");
            int a = 10;
            int b = 5;
            int result = a + b;  // No exception is thrown here
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block: " + e.getMessage());
            //this will not print bcz thier no exception try execute normally and skips catch

        } finally {
            System.out.println("Inside finally block (always runs)");
        }

        System.out.println("Program continues after try-catch-finally.");
    }

}


