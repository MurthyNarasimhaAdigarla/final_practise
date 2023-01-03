package others.com.src.String_Programs;

public class WordsReverseinString {

    static String s[];

    public static void main(String[] args) {

        characterReverseInString();
        onlyWordsReverseInString();
    }
    public static void characterReverseInString() {
        s = "Murthy is good boy".split("");
        String charReverse = " ";

        for (int i = s.length - 1; i >= 0; i--) {
            charReverse = charReverse + s[i] + " ";
        }
        System.out.println(charReverse);
    }
    public static void onlyWordsReverseInString() {


        String wordsReverse = " ";
        s = "Murthy is good boy".split(" ");

        for (int i = s.length - 1; i >= 0; i--) {
            wordsReverse = wordsReverse + s[i] + " ";


        }
        System.out.println(wordsReverse);
    }

}
