package Test;

import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        System.out.print("Enter year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            System.out.println(year+" is Leap year");
        }
        else{
            System.out.println(year+ " is not Leap year");
        }
    }
}
