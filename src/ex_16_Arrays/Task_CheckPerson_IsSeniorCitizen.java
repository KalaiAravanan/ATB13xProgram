package ex_16_Arrays;
import java.util.Scanner;

public class Task_CheckPerson_IsSeniorCitizen {
    public static void main(String[] args) {
        /*:- take the age input from the user.
            Implement Age Category Logic:
            Define the criteria for different age categories:
            Child: Age 0 to 12
            Teenager: Age 13 to 19
            Adult: Age 20 to 64
            Senior Citizen: Age 65 and older */

            System.out.println("Enter your age");
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();

            if((age >= 0) && (age <= 12)){
                System.out.println("You're Child, " + age);
            }
            else if((age >= 13) && (age <= 19)){
                System.out.println("You're Teenage, " + age);
            }
            else if ((age >= 20) && (age <= 64)){
            System.out.println("You're Adult, " + age);
            }
            else {
                System.out.println("Senior Citizen");
            }
    }
}
