package ex_11_WhileLoop;

public class Task_CountVowels_And_Consonants {
    public static void main(String[] args) {

        //Read word and then count vowels & consonants in the word

        String name = "Ananya";
        name = name.toLowerCase();

        int vowelcount = 0;
        int consonantscount = 0;
        System.out.println(name);

            for (int i = 0; i < name.length(); ++i) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelcount = vowelcount + 1;

            } else {
                consonantscount = consonantscount + 1;

            }
        }
        System.out.println("Total Vowels " + vowelcount);
        System.out.println("Total consonants :" + consonantscount);
    }
}