package Lab_11_WhileLoop;

public class Task_PalindromeOfString {
    public static void main(String[] args) {
        //Palindrome of String (chatAt()) - naman, → reverse - naman , madam ( string = rev(str)

       String str = "Malayalam", reverseStr = "";
       str = str.toLowerCase();

       int strLength = str.length();

        for(int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
            reverseStr = reverseStr.toLowerCase();
        }

        if (str.equals(reverseStr)) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}

