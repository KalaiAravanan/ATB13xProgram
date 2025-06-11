package ex_06_TernaryOperator;

public class Lab068_Maxof3Digits {
    public static void main(String[] args) {
        // Find the maximum between the three numbers.
        // Now we will be using the logic building formula.

        int n1 = 27;
        int n2 = 100;
        int n3 = 46;

        // Step 1 : Find inputs /outputs
        // I/O -> n1,n2,n3 - int
        // O/P -> String ->  max number

        // Step 2 - Rough Logic, Think about it.
        // n1 > n2 and n1  > n3 -> n1
        // n2 > n3 and n2>  n1 ->  n2
        // n3

        // Step 3
//        int max = (n1> n2) ? A : B;
        // A -> (n1 > n3) ? n1 : n3
        // B -> ( n2> n3) ? n2 : n3

        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.println(max);

    }
}
