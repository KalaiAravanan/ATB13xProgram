package ex_11_WhileLoop;
import java.util.Scanner;

public class Lab_121_While_Factorial {
    public static void main(String[] args) {
        // Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the number!");
        if(!scanner.hasNextInt()){
            System.out.println("Enter the int you fool!");
            return;
        }

        int number = scanner.nextInt();
        long factorial = 1;

        if(number < 0){
            System.out.println("Negative Factorial is not allowed!");
            return;
        }

        if(number <=0){
            System.out.println(factorial);
        }else{
            // Calculate the factorial
            for (int i = 1; i <= number ; i++) {
                factorial = factorial*i;
            }
        }
        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial
    }
}
