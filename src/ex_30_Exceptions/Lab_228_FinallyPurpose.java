package ex_30_Exceptions;

import java.util.Scanner;

public class Lab_228_FinallyPurpose {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        System.out.println("Enter the v");
        int v = sc.nextInt();
        try {
            int b= 10/v;
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            sc.close();
            System.out.println("end of program , sc closed!");
        }

    }
}
