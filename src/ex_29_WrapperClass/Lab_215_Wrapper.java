package ex_29_WrapperClass;

public class Lab_215_Wrapper {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a; // This Boxing -> automatically JVM will store the value
        // Primitive to wrapper -> AutoBoxing
        System.out.println(b.intValue()); // Behav
        System.out.println(Integer.MIN_VALUE); // Behav

        Integer a2 = 42;
        int v = a2; // Unboxing -> wrapper is removed, attribute, behaviour is lost.
        System.out.println(v);
    }
}
