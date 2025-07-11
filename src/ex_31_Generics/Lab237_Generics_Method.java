package ex_31_Generics;

public class Lab237_Generics_Method {
    public static void main(String[] args) {
        sum(3, 10, 15);
        sum(21.5, 28.2);
    }


    static <T> T sum(T a, T b, T c) {
        System.out.println("Generic method - returns a");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        return null;
    }

    static <T> void sum(T a, T b) {
        System.out.println("Generic method ");
    }

}