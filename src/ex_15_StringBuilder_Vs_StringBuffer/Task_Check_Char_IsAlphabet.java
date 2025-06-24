package ex_15_StringBuilder_Vs_StringBuffer;

public class Task_Check_Char_IsAlphabet {
    public static void main(String[] args) {
        //Check if a Character is an Alphabet.
        //Ascci ch A-Z is 65 to 90,  a-z is 97-122

        char ch = 'K';
        System.out.print(ch);

        if((ch >= 'A') && (ch <= 'Z') || (ch >= 'a') && (ch <= 'z')){
            System.out.println(" is an Alphabet");
        }
        else {
            System.out.println(" is not an Alphabet");
        }
    }
}
