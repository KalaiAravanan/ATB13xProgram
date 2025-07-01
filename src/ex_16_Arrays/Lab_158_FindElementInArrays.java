package ex_16_Arrays;

public class Lab_158_FindElementInArrays {
    public static void main(String[] args) {
        int[] numlist = {12,45,23,87,10};
        int target = 23;

        for(int i=0; i<=numlist.length-1; i++) {
            if (numlist[i] == target) {
                System.out.println("Target found");
                return;
            }
        }
    }
}
