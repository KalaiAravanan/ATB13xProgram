package ex_16_Arrays;

public class Lab_Interview_SecondLargest {
    public static void main(String[] args) {
        // Find Second Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        // 100 , 34
        //Arrays.sort(numbers);
        //System.out.println(numbers[numbers.length-2]);
        //System.out.println(numbers[numbers.length-3]);
        // You find it without using the sort function.

        int largest = 0;
        int secondLargest = 0;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("SecondLargest: "+secondLargest);
    }
}
