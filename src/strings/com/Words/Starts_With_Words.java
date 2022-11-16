package strings.com.Words;

public class Starts_With_Words {

    public static void main(String[] args) {

        String s = "MurTHY Is a rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;

            else {
                if (w.startsWith("r"))
                    System.out.println(w);

                w = "";
            }

        }
    }
}
