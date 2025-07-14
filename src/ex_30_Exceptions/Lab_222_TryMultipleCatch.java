package ex_30_Exceptions;

public class Lab_222_TryMultipleCatch {
    public static void main(String[] args) {
        int a = 10;
        int result = 0;
        try {
            result = a / 0;
            //first use/specific exception when you know what exception code will through
        } catch (ArithmeticException  e) {
            System.out.println(e.getMessage());
        } catch (Exception  e) { // then use generic exception any unexpected exception
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }
}
