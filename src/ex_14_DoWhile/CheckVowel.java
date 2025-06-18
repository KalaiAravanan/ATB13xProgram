package ex_14_DoWhile;
import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single alphabet: ");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("consonants");
        }
    }
}
