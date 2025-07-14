package ex_30_Exceptions;

public class Lab_227_Try_catch_Finally {
    public static void main(String[] args) {

        try {
            int a =Integer.parseInt(args[0]);
            int c = 0;
            c = 10/a;
        } catch (Exception e) {
            System.out.println(e.getMessage());
           // e.printStackTrace();
        } finally {
            System.out.println("I will be always executed!");

        }

    }
}
