package ex_30_Exceptions;

public class Lab217_ExceptionExplained {
    public static void main(String[] args) {
        // to give input click menu, Run->Edit Configurations and enter input value in program arguments
        System.out.println("Enter an input value");
        String inputvalue =args[0]; //Arrayindexoutofexception -when no input given
        Integer a = Integer.parseInt(inputvalue); // NumberFormatException when input given is string then while conventing we will get this
        Integer b = 100 / a; // divide by zero exception - when given input is 0 then 100/0 will give this error
        System.out.println(b);
    }
}
