package ex_05_TypeCasting;

public class Lab058_TypeCasting2 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; //  Widening -> Implicit Casting
        System.out.println(a);
        int a1 = (int)b; // Widening -> Explicit Casting but not needed to mention explicit
        // bcoz we are casting from small storage - > big storage space
        System.out.println(a1);

    }

}
