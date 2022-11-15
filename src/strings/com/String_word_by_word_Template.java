package strings.com;

public class String_word_by_word_Template {


    public static void main(String[] args) {
        String s = "Murthy is a good boy";
        s += " ";
        String w = "";


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;
            else if (w.length() <= 1) {
                System.out.println(w.charAt(0));

            } else {
                //System.out.println(w.substring(0, 2));
                System.out.println(w);
                w = "";
            }

        }


    }
}
