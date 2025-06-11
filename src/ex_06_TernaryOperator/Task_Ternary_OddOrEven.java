package ex_06_TernaryOperator;

public class Task_Ternary_OddOrEven {
    public static void main(String[] args) {

        int a = 19;

        System.out.println(a);
        String result = a %2 == 0 ? "Even" : "Odd";
        System.out.println("Value of A now is : "+result);

        a = ++a;
        System.out.println(a);
        String newresult = a %2 == 0 ? "Even" : "Odd";
        System.out.println("Value of A now is : " +newresult);


    }
}
