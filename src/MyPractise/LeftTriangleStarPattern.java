package MyPractise;

public class LeftTriangleStarPattern {
    public static void main(String[] args) {
        //This is a basic and popular pattern printing question where stars are printed in a right-angled triangle form.
        //     *
        //    **
        //   ***
        //  ****
        // *****

        int rows = 5;  

        for (int i = 1; i <= rows; i++) {
            // Print spaces first
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Then print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            // Move to next line
            System.out.println();
        }
    }
 }


