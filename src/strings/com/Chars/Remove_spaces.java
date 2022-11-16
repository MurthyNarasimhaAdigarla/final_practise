package strings.com.Chars;

public class Remove_spaces {
    public static void main(String[] args) {
        String s = "MurTHY Is a 9966GOOOd BoYyyy2366";
        String r = "";
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (!Character.isWhitespace(c))
                r = r + c;
        }
        System.out.println(r);
    }


}
