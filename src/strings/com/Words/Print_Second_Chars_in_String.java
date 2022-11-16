package strings.com.Words;

public class Print_Second_Chars_in_String {
    public static void main(String[] args) {

        String s = "MurTHY Is a 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;
            else if (w.length() <= 2) {
                System.out.println(w.charAt(0));

            } else {
                System.out.println(w.substring(0, 2));
                w = "";
            }

        }


    }
}


