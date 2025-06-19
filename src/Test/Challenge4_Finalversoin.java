package Test;

public class Challenge4_Finalversoin {
    public static void main(String[] args) {
        //- Show the difference between ++i and i++
        //      - Show the difference between --i and i--
        //    - Print values before and after operations
        int a = 5;
        System.out.println("Original:" +a);

        System.out.println("Pre increnemnt:"+ a);
        int b = ++a;
        System.out.println("Post increnemnt:"+ b);

        System.out.println("Pre increnemnt:"+ a);
        int c = a++;
        System.out.println("Post increment :"+ c);

    }
}
