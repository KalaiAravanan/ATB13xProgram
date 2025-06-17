package ex_05_TypeCasting;
import java.util.Scanner;

public class Task_Triangleclassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A: ");
        int a = scanner.nextInt();

        System.out.print("Enter side B: ");
        int b = scanner.nextInt();

        System.out.print("Enter side C: ");
        int c = scanner.nextInt();

        // Check for triangle validity using triangle inequality theorem
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Not a Triangle");
        }

        // Classification logic
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
    }
}
