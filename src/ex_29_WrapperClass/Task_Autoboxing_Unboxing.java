package ex_29_WrapperClass;

public class Task_Autoboxing_Unboxing {
    public static void main(String[] args) {
        /*Description: Demonstrate automatic conversion from int to Integer (Autoboxing) and back from Integer to int (Unboxing).
    📤 Expected Output:
        Primitive: 50
        Wrapper: 50
        Unboxed again: 50 */

        int x = 50;
        System.out.println("Primitive: " +x);

        Integer y = x; //Primitive)int) to wrapper(Integar) = autoboxing
        System.out.println("Wrapper: " + y);

        int z = y; //back from Integer to int (Unboxing)
        System.out.println("Unboxed again: " +z);

    }
}
