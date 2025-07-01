package ex_16_Arrays;
import java.util.Arrays;

public class Lab_152_Arrays_Print {
    public static void main(String[] args) {
        int[] marks = {51, 100, 91, 87, 90};
        System.out.println("  - - - - - -");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
//        System.out.println(marks); // Ref Address

        Arrays.sort(marks); //not a good practise to use arrays.sort

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}