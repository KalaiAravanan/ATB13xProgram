package retest;

import java.util.Scanner;

public class Ch_8  {
    public static void main(String[] args) {
        System.out.print("Enter year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if((year % 4 == 0)  || (year % 400 == 0)){
            System.out.println(year+" is Leap year");
        }
        else{
            System.out.println(year+ " is not Leap year");
        }
    }
}
