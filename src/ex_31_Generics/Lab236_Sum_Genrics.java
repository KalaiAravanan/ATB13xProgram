package ex_31_Generics;

public class Lab236_Sum_Genrics {
    public static void main(String[] args) {
        add ad = new add();
        int result = ad.sum(12,50);
        System.out.println(result);
        double results = ad.sum(43.1,23.8);
        System.out.println(results);
    }
}
class add {
    static int sum(int a, int b) {
        return a + b;
    }

    static double sum(double a, double b) {
        return a + b;
    }
}
