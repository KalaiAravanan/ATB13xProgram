package ex_06_TernaryOperator;

public class Lab_064_MinNumber {
    public static void main(String[] args) {
        int a = 26;
        int b = 30;

        int min = a < b ? a : b;
        System.out.println("Smallest number is: "+ min);
    }
}
