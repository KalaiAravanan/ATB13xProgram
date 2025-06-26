package ex_15_StringBuilder_Vs_StringBuffer;

import java.util.Scanner;

public class Task_PersonCanTravel_Based_OnVisaStatusAndAge {
    public static void main(String[] args) {
        /*take the input from the user for
        Age (integer).
        Visa Status (String or boolean).
     Check Eligibility:
        :- If age is 18 or older and visa status is valid, the person can travel.
        Otherwise, the person cannot travel.
     Validation Criteria
        Age: - Must be a non-negative integer.
        :- Should be greater than or equal to 18 to be eligible to travel.
        Visa Status :- Must be a valid string indicating the visa status (e.g., "valid" or "invalid").
        :- You can also use a boolean where true indicates a valid visa and false indicates an
        invalid visa. */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the visa status(True/False)");
        String visaStatus = scanner.nextLine();
        boolean status = Boolean.parseBoolean(visaStatus.toLowerCase());

        if (age >= 18 && status) {
            System.out.println("You can travel");
        } else {
            System.out.println("You can't travel");
        }

    }
    }


