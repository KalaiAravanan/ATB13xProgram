package ex_26_IIB;

public class Lab198_IIB_Vs_SIB {
    public static void main(String[] args) {
        A a = new A();
        A b = new A();

    }
}

class A{
    void A(){
        System.out.println("Constructor is called");
    }

    {
        System.out.println("IIB is called - whenever an object is created");
    }

    static {
        System.out.println("SSIB is called once when class is loaded");
    }
}
