package ex_15_StringBuilder_Vs_StringBuffer;

import java.util.Scanner;

public class Task_LoanEligibility {
    public static void main(String[] args) {
        /* Check if a Person is Eligible for a Loan (Based on Age, Salary, and Credit Score)
           Take the below User info and store it into the variables:
           Age (integer)
           Salary (double or float)
           Credit Score (integer)
        Age Validation:
        :- Check if the age is a positive integer.
        :- Ensure the age is at least 18 years old.
        :- Max age can be 80.
        Salary Validation:
        :- Check if the salary is a positive number.
        :- Define a minimum salary threshold (e.g., 30,000).
        Credit Score Validation:
        :- Check if the credit score is a positive integer.
        :- Define a minimum credit score threshold (e.g., 650).
        :- Max credit score threshold (e.g., 850).  */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int age = scanner.nextInt();
        System.out.println("Enter Your Salary");
        double salary = scanner.nextDouble();
        System.out.println("Enter Your Credit score");
        int creditScore = scanner.nextInt();
        scanner.close();
        boolean validAge = age >= 18 && age <= 80;
        boolean validSalary = salary >= 30000;
        boolean validCreditScore = creditScore >= 650 && creditScore <= 850;

        if (validAge && validSalary && validCreditScore) {
            System.out.println("Congrats !! You're eligible for loan !!");
        } else {
            System.out.println("Sorry you're not eligible for loan");
        }
    }
 }

