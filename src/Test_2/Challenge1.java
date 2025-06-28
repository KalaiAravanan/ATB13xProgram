package Test_2;

public class Challenge1 {
    public static void main(String[] args) {
        // 1. String Declaration and Initialization
        String str1 = "Hello";
        String str2 = " World!";
        String sentence = "Hello World";

        // concatetion
        String anotherCombinedString = str1.concat(str2);
        System.out.println(anotherCombinedString);

        // String Length
        System.out.println("Length: " + sentence.length());

        // substring
        String sub1 = sentence.substring(6); // "programming is fun."
        System.out.println(sub1);

        //  Character Extraction
        char firstChar = str1.charAt(0);
        System.out.println("FirstChar: "+firstChar);

    }
    }

