package ex_10_ForLoop;

public class Lab_113_ForLoopCont_EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) { // 0 to 50, 51 Times
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd ->" + i);
        }
    }
}
