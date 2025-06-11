package ex_05_TypeCasting;

public class Lab059_TypeCastingNarrowing {
    public static void main(String[] args) {
        int val  = 300;
        System.out.println("Before converting to byte: "+val);
        //byte b = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b1 = (byte)val; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        // Data Loss.
        System.out.println("after converting to byte: "+b1);
    }
}
