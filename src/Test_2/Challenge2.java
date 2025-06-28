package Test_2;

public class Challenge2 {
    public static void main(String[] args) {
        // Creating strings
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = new String("Hello");

        //==
       System.out.println("==: " + (str1 == str2));

        // equals()
        System.out.println("equals: " + str1.equals(str2));


        //  equalsIgnoreCase()
                System.out.println("equalsIgnoreCase: " + str1.equalsIgnoreCase(str3));

        // compareTo()
        System.out.println("compareTo(): " + str1.compareTo(str2)); // 0 (equal)

    }
}

