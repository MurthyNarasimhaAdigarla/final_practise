package strings.com.Words;

public class String_word_by_word_Template {


    public static void main(String[] args) {
        String s = "MurTHY Is a 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;
             else {
                //System.out.println(w.substring(0, 2));
                System.out.println(w);
                w = "";
            }

        }


    }
}
