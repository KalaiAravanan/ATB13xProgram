package ex_27_Static;

public class Lab206_Static {
    public static void main(String[] args) {

        B b = new B(10);
        B b2 = new B(11);

        System.out.println(b.c);
        System.out.println(b2.c);

        System.out.println(B.d); //static vairable called - using class name.variable name

        System.out.println(b.d);
        System.out.println(b2.d);
    }
}

class B{
    int c = 10;
    static int  d = 20;

     B(int c){ //constructor -special method used to Initialize value
        this.c = c;
    }

    void displayvalue(){
        System.out.println(this.c);
    }

    static void staticMethod(){
        System.out.println("I will be called when class is loaded");
//        System.out.println(this.a); // Methods cannot access non-static variables in a static function.
    }
}
