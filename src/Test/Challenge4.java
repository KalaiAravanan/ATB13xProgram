package Test;

public class Challenge4 {
    public static void main(String[] args) {
        //- Show the difference between ++i and i++
          //      - Show the difference between --i and i--
            //    - Print values before and after operations
        int a = 5;

        System.out.println("Original:" +a);
        int b = ++a;

        System.out.println("Pre increnemnt:"+ b);


        int c = a++;
                System.out.println("Post increment :"+ c);

    }
}
