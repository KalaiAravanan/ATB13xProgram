package ex_10_ForLoop;

public class Task_GradeCalculation {
    public static void main(String[] args) {
        //Write a program that calculates and displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        int mark =90;
        String grade = ((mark >= 90) ? "A" : (mark >= 80) ? "B"  : (mark >= 70) ? "C"  : (mark >= 60) ? "D"  : "Fail");
        System.out.println(grade);
    }
}
