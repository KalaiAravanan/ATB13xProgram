package ex_06_TernaryOperator;

public class Lab_067_AgeClassificatoin {
    public static void main(String[] args) {
        //int age < 18 minor
        //int age >18 <65 Adult
        //int age? 65 senior

        int age =72;
        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior";
        System.out.println("Person is: "+result);
    }
}
