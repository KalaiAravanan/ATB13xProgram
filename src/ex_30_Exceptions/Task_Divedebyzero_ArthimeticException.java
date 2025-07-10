package ex_30_Exceptions;

public class Task_Divedebyzero_ArthimeticException {
    public static void main(String[] args) {
        /*📘 Description: Divide a number by zero and handle the exception.
          🧤 Expected Output:
          Catch ArithmeticException and print a friendly message. */

        int a = 0;

        try {
            int b = a / 0;
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
           System.out.println("Divide by Zero error");
        }

    }
}

