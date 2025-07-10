package ex_30_Exceptions;

public class Task_TryCatch_with_Multiple_Catch_Blocks {
    public static void main(String[] args) {
        /* Description: Write code that may throw either ArithmeticException or ArrayIndexOutOfBoundsException and handle them
        with multiple catch blocks.
        🧤 Expected Output:
        Print which exception occurred
         */

        int[] a = {23,15,20};

        try {
            //int result = a[2]/0; //arithmetic exception error
            int result = a[4]; //Array out of index exception error
        } catch (ArithmeticException e) {
            //throw new RuntimeException(e);
            System.out.println("Arithmetic Exception error");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            //throw new RuntimeException(e);
            System.out.println("Array Index Out Of Bounds Exception error");
        }

    }
}
