package ex_10_ForLoop;

public class Lab_112_ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, 50 times

            if(i ==5){
                continue; // skip the code and move to next to top
            }
            System.out.println(i);
            }
    }
}
