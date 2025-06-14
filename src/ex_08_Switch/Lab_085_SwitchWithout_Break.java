package ex_08_Switch;

import java.util.Scanner;

public class Lab_085_SwitchWithout_Break {
    public static void main(String[] args) {
        // Switch

        // Take a user input and tell them the day which they have told.
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        //int day = Integer.parseInt(args[0]); - CLI option :another way to get input from the user but not good option to use

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day");
        int days = scanner.nextInt();

        switch(days){
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");


            default:
                System.out.println("Enter an another date");


        }
}
}