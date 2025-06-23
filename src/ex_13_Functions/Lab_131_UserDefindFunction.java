package ex_13_Functions;

public class Lab_131_UserDefindFunction {
    public static void main(String[] args) {
        int result = sum_of_number(3, 4);

        sum_of_number_no_return(3,5);

        System.out.println(result);
    }

    static int sum_of_number(int a, int b) {
        return a + b;
    }

    static void sum_of_number_no_return(int a, int b) {
        System.out.println(a+b);
    }
}
