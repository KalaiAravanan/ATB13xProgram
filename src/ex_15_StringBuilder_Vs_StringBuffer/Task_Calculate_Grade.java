package ex_15_StringBuilder_Vs_StringBuffer;

import java.util.Scanner;

public class Task_Calculate_Grade {
    public static void main(String[] args) {
        //Take user input for marks (Use Scanner class).
        // Check the validity of marks (ensure they are between 0 and 100).
        // Use if-else-if conditions to determine the grade based on marks.
        // Display the grade as output.
        //Marks Range Grade
        //90 - 100   A+
        //80 - 89    A
        //70 - 79    B
        //60 - 69    C
        //50 - 59    D
        //40 - 49    E
        //Below 40   Fail

        System.out.println("Enter your marks: ");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if((marks < 0) || (marks>100)){
            System.out.println("Enter another valid mark");
        }

        if(marks >= 90){
            System.out.println("A+");
        }
        else if(marks >=80){
            System.out.println("A");
        }
        else if(marks >=70){
            System.out.println("B");
        }
        else if(marks >= 60){
            System.out.println("C");
        }
        else if(marks >= 50){
            System.out.println("D");
        }
        else if(marks >= 40){
            System.out.println("E");
        }
        else {
            System.out.println("F");
        }



    }
}
