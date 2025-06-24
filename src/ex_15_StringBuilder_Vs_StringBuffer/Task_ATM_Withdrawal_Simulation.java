package ex_15_StringBuilder_Vs_StringBuffer;
import java.time.LocalDate;
import java.util.Scanner;

public class Task_ATM_Withdrawal_Simulation {
    public static void main(String[] args) {
        //1️⃣ Initialize the account balance with a fixed amount (e.g., ₹10,000).
        //2️⃣ Take user input for the amount they want to withdraw.
        //3️⃣ Check withdrawal conditions:
        //The amount should be greater than zero.
        //The amount should be a multiple of 100 (common ATM rule).
        //The amount should not exceed the account balance.
        //4️⃣ Deduct the amount from the balance if conditions are met.
        //5️⃣ Display the updated balance or an error message if the withdrawal fails.

        int acc_Balance = 10000;
        LocalDate localDate = LocalDate.now();

        System.out.println("Withdrawal - Enter your amout");
        Scanner scanner = new Scanner(System.in);
        int withdrawal_Amount = scanner.nextInt();

        if (withdrawal_Amount <= 0) {
            System.out.println("Enter an Valid Amount");
            return;
        } else if (withdrawal_Amount > acc_Balance) {
            System.out.println("Insufficient Balance");
            return;
        } else if (withdrawal_Amount % 100 != 0) {
            System.out.println("Enter the amount in multiples of 100");
            return;
        } else {
            acc_Balance = acc_Balance - withdrawal_Amount;
            System.out.println("Withdrawal is completed: " + withdrawal_Amount);
            System.out.println("Account Balance is: " + acc_Balance + " as of " + localDate);
        }
    }
}

