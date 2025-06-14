package ex_08_Switch;
import java.util.Scanner;

public class Lab_086Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day 1-7");
        int days = scanner.nextInt();

        switch(days){
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");
        }
    }
}
