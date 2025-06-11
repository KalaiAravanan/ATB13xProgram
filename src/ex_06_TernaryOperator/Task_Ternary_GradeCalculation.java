package ex_06_TernaryOperator;

public class Task_Ternary_GradeCalculation {
    public static void main(String[] args) {
        //Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        //>=90 A+
        //>=75 A
        //>=60 B
        //>=40 C
        //<40 fail

        int mark =75;
        String grade = (mark >= 90) ? "A+" : (mark >= 75) ? "A"  : (mark >= 60) ? "B"  : (mark >= 40) ? "C"  : "Fail";
        System.out.println(grade);

    }
}
