package ex_15_StringBuilder_Vs_StringBuffer;

import java.util.Scanner;

public class Task_Check_IfNumber_IsPrime {
    public static void main(String[] args) {
        //Check if number is Prime
        //Scanner sc = new Scanner(System.in);

        // System.out.print("Enter a number: ");
       //  int num = sc.nextInt();
       //Prime number series : 2, 3, 5, 7, 11, 13, 17, 19
        int num = 4;
        System.out.println("Number is: "+ num);
        boolean isPrime = true;

        if (num <= 1) {
            System.out.println("not prime");
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    System.out.println("not Prime");
                }
            }
            if(isPrime) {
                System.out.println("Prime");
            }


        }


    }
}
