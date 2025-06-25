package ex_15_StringBuilder_Vs_StringBuffer;

import java.util.Scanner;

public class Task_UseSalary_CalculateBonus {
    public static void main(String[] args) {
        /* :- take the salary and Year info from the User.
        Implement Bonus Calculation Logic:
        Define the bonus structure based on salary and years of experience.
           :- If years of experience is less than 1 year: No bonus.
           :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.
           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.
           :- If years of experience is greater than 6 years: Bonus is 15% of the salary. */

        double bonus =0;
        System.out.println("Enter your Salary: ");
        Scanner scanner1 = new Scanner(System.in);
        int salary = scanner1.nextInt();

        System.out.println("Enter your of Experience: ");
        Scanner scanner2 = new Scanner(System.in);
        int exp = scanner2.nextInt();

        if ((exp == 0) || (salary <= 0)) {
            System.out.println("Enter an valid Salary and Experience");
            return;
        }

        if ((exp < 1)) {
            bonus = 0;
            return;
        } else if ((exp >= 1) && (exp <= 5)) {
            bonus = salary * 0.05; // 5% of salary
            return;
        } else if ((exp >= 4) && (exp <= 6)) {
            bonus = salary * 0.1; // 10% of salary
            return;
        } else if ((exp >= 6)) {
            bonus = salary * 0.15; // 15% of salary
            return;
        }
        System.out.println("Your Salary is : " + salary);

        if(bonus> 0) {
        System.out.println("Congrats !! Your Bonus is : " +bonus);
        }
        else {
            System.out.println("Sorry you didn't get a bonus");
        }

    }
}
