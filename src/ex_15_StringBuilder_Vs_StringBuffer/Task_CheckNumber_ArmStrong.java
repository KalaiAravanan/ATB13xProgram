package ex_15_StringBuilder_Vs_StringBuffer;

import java.util.Scanner;

public class Task_CheckNumber_ArmStrong {
    public static void main(String[] args) {
     //The Armstrong numbers of first kind up
     // to 10 digits are 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = sc.nextInt();
        int digit = number;
        int sum = 0 ;

        int digit_count = String.valueOf(number).length();
        while (digit >0){

            int single_dig = digit % 10;
            sum += (int) Math.pow(single_dig , digit_count);
            digit = digit /10;

        }

        if(number == sum){
            System.out.println("Number is armstrong");
        } else {
            System.out.println("Number is not armstrong");
        }

      }
  }

