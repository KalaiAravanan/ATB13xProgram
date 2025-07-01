package ex_16_Arrays;

public class Lab_155_Arrays_Reverse {
    public static void main(String[] args) {
        int[] marks = {10,32,14,20,18};

        for(int i = 0; i <= marks.length-1; i++){
            System.out.print(marks[i]+",");
        }
        System.out.println();
        for(int i =marks.length-1; i >= 0; i--){
            System.out.print(marks[i]+",");
        }
    }
}
