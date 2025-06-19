package retest;
public class Ch_12 {
    public static void main(String[] args) {
        int number =2;
        if (number < 0) {
            System.out.println("No factorial.");
        } else {
            long factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
  }
