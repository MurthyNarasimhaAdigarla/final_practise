package strings.com.Chars;

public class Extract_UC_Digits_Chars {
    public static void main(String[] args) {


        String s = "MurTHY Is a 9966GOOOd BoYyyy2366";
        String d = "";
        String ns = "";


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                ns += c;
            if (Character.isDigit(c))
                d += c;


        }
        System.out.println(ns + d);
    }
}
