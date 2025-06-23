package ex_14_String;

public class Check_Char_Vowel_Or_Constant {
    public static void main(String[] args) {
        //Read word and then count vowels & consonants in the word

        char intial = 'a';
        System.out.println(intial);

        switch(intial){
        case 'a','e','i','o','u' :
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}
