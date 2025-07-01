package ex_16_Arrays;
import java.util.Scanner;

public class Task_ConvertDays_IntoMonthYear {
    public static void main(String[] args) {
            /*:- Take the Days Input from the User
            Define the conversion logic:
            :- Assume 1 year = 365 days.
            :- Assume 1 month = 30 days
            :- Convert the Days into Years, Month and days and Print it.
            if you input 1000 days, the output of the program would be: 2 years, 9 months, and 0 days.*/

        System.out.println("Enter days");
        Scanner scanner = new Scanner(System.in);
        int totalDays = scanner.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;
        System.out.println(years + " years, " + months + " months, and " + days + " days");
    }
}
