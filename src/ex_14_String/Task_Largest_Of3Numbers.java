package ex_14_String;

public class Task_Largest_Of3Numbers {
    public static void main(String[] args) {
        int a=22, b=34, c=18;
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest.");
        } else {
            System.out.println(c + " is the largest.");
        }
    }
}
