package ex_11_WhileLoop;

import java.util.Scanner;

public class Task_vowels {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + "is vowel");

        } else {
            System.out.println(ch + "is consonants");
        }
    }
}



