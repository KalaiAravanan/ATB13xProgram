package ex_30_Exceptions;

public class Lab_224_TryIQ {
    public static void main(String[] args) {
        String name = null;
        int a =40;
        try {
            int result = a / 10;
            name.trim();
        } catch (NullPointerException | ArithmeticException e){
            System.out.println("Exception happened");
            System.out.println(e.getMessage()); //get the exception type
            }
    }
}
