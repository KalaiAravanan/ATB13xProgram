package Test;

public class Challenge5 {
    public static void main(String[] args) {
        //- Show operator precedence with complex expressions
          //      - Demonstrate implicit and explicit type casting
            //    - Print results with explanations
        int a =10;
        double b =3.5;

        double c = a;
        System.out.println("Implicit " + c);

        double d = (double)a;
        System.out.println("Explicit: " +d);
    }
}
