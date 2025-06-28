package ex_16_Arrays;

public class Task_Number_DivisbleBy5And11 {
    public static void main(String[] args) {
        int num = 7;

        if ((num % 5 == 0) || (num % 11 == 0)) {
            System.out.println(num +  " is divisble by 5 and 11");
        }
        else {
            System.out.println(num + "is not divisble by 5 & 11");
        }
    }
}
