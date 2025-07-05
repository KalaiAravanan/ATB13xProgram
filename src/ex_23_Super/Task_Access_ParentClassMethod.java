package ex_23_Super;

public class Task_Access_ParentClassMethod {
    public static void main(String[] args) {
        //Program 2: Access parent class method using super
        flowers fs = new flowers();
        fs.water();

    }
}

class plants{
    plants(){
        System.out.println("Plants class constructor");
    }

    void water(){
        System.out.println("Water plants");
    }
}

class flowers extends plants{
    void water(){
        super.water();
    }
}