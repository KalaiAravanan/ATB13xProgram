package ex_16_Arrays;

public class Lab_159_String_CLI_Foreach_Loop {
    public static void main(String[] newvalue) {
        // 10 newvalue true
        for (int i = 0; i < newvalue.length; i++) {
            System.out.println(newvalue[i]);
        }
        System.out.println(" -- ");
        for(String arg:newvalue){
            System.out.println(arg);
        }
    }
}
