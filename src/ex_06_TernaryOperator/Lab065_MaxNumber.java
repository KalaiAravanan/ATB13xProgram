package ex_06_TernaryOperator;

public class Lab065_MaxNumber {
    public static void main(String[] args) {
        int x = 56;
        int y = 22;
        //System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println("Largest number is: "+max);
    }
}
