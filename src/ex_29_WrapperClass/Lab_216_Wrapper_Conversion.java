package ex_29_WrapperClass;

public class Lab_216_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "25";
        Integer newval = Integer.parseInt(num);
        Integer anoval = Integer.valueOf(num);
        System.out.println(newval);
        System.out.println(anoval);

        //String to primitive
        int result = Integer.parseInt(num);
        System.out.println(result);

        // Wrapper to String (toString method)
        Integer x =10;
        String y = x.toString();
        System.out.println("y: " +y);

        // Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        String printvalue = age_wrapper.toString();
        System.out.println(printvalue);
    }
}
