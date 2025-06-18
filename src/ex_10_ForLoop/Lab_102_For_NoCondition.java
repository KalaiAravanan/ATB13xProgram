package ex_10_ForLoop;

public class Lab_102_For_NoCondition {
    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
        }

        // exit code 130 (Stop by Yourself- Kill) Red Button - interrupted by signal
        // exit code 0 - Successful
    }
}
