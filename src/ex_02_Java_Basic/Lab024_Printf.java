package ex_02_Java_Basic;

public class Lab024_Printf {
    public static void main(String[] args) {
        int a = 10;
        System.out.print("print command print without the new line");
        System.out.println("Hello World");
        System.out.println("add the new line in the end");


        System.out.println(a);
        System.out.printf("Your variable name is %d",a);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean
        int b = 20;
        System.out.println( " --- ");
        System.out.printf("%d x %d",a,b);
    }
}
