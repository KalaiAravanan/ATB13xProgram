package ex_27_Static;

public class Lab_205_Static_IIB {
       public static void main(String[] args) {
            P p1 = new P();
            P p2 = new P();
            System.out.println(P.a);
            p1.a = 12;
            System.out.println(P.a);
            System.out.println(p1.a);
            System.out.println(p2.a);

            // System.out.println(P.b);
            p1.b  = 24;
            p2.b =34;
            System.out.println(p1.b);
            System.out.println(p2.b);
        }
    }

    class P{
        static int a = 10;
        int b = 10;

        static {
            // This is static block.
            // This is called whenever a class a loaded.
            System.out.println("Hi, this is called, becoz, class is laoded");
            // The usage of static block is if you want to call some of the methods, like calling a database connection, calling an Excel collection
        }
    }
