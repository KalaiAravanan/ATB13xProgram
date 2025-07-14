package ex_30_Exceptions;

public class Lab_221_TryCatch {
    public static void main(String[] args) {
        int a = 10;
        int result = 0;
        try {
            result = a / 0;
        } catch (Exception  e) {
            System.out.println(e.getMessage());
        }
        System.out.println(result);
    }
    }

