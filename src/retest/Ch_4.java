package retest;

public class Ch_4 {
    public static void main(String[] args) {
        int a =10;
        double b =3.5;

        double c = a;
        System.out.println("Implicit " + c);

        double d = (double)a;
        System.out.println("Explicit: " +d);
    }
}
