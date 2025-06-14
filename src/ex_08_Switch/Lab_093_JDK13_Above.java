package ex_08_Switch;

public class Lab_093_JDK13_Above {
    public static void main(String[] args) {
        // in JDK > 13
        //  No need of break keyword
        // one line supported.

       int itemcode = 111;
       switch(itemcode){
           case 111 -> System.out.println("111");
           case 112 -> System.out.println("112");
           case 113 -> System.out.println("113");
       }

    }
}
