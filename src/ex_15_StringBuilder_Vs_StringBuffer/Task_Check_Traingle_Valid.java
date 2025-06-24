package ex_15_StringBuilder_Vs_StringBuffer;

public class Task_Check_Traingle_Valid {
    public static void main(String[] args) {
        //Check if a Triangle is Valid Based on Three Sides.a triangle is valid if and only if the sum of any two sides is greater than the third side.
        //Triangle Validity Conditions:
        //Let the sides be a, b, and c. Then the triangle is valid if: a + b > c
        //a + c > b
        //b + c > a

        int a = 10, b = 2, c = 20;
        if((a+b >c) || (a + c > b) || (b + c > a)){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Not valid Triangle");
        }
    }
}
