package ex_15_StringBuilder_Vs_StringBuffer;

public class Task_Smallest_of_3Numbers {
    public static void main(String[] args) {
        int a=22, b=34, c=18;
        if (a <= b && a <= c) {
            System.out.println(a + " is the smallest.");
        } else if (b <= a && b <= c) {
            System.out.println(b + " is the smallest.");
        } else {
            System.out.println(c + " is the smallest.");
        }
    }
}
