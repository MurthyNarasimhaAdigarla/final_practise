package strings.com.Chars;

public class Reverse_String_Char {
    public static void main(String[] args) {
        String s = "MurTHY Is a 9966GOOOd BoYyyy2366";
        String ns = "";

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
             ns = c + ns;
        }

            System.out.println("Its is ::" + ns);
    }
}
