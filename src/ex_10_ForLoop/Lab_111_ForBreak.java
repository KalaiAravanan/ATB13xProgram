package ex_10_ForLoop;

public class Lab_111_ForBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times
            if (i == 5) {
                break;
            } else {
                System.out.println(i);
            }
        }
    }
}
