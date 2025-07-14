package ex_30_Exceptions;

public class Lab_220_HandleException {
    public static void main(String[] args) {
        int a = 0;
        try {
            a = 10 / 0; // java.lang.ArithmeticException
        } catch (Exception e) {
            System.out.println("Div by Zero not allowed!");
        }
        System.out.println(a);

        // Checked - JVM
        // JVM knows about it , During Compilation - JVM is saying that
        // there can be case when this file is not found.
        //

        // JVM knows that this may lead to file not found exception
        // so it telling to handle it.
    }
}
