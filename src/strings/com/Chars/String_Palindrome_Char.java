package strings.com.Chars;

public class String_Palindrome_Char {
    public static void main(String[] args) {
        String s = "Tenet";
        String ns = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
             ns = c + ns;
        }
        if(ns.equalsIgnoreCase(s))
            System.out.println("It is Palindrome");
        else
            System.out.println("It is not Palindrome");
    }
}
