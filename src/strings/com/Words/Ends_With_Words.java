package strings.com.Words;

public class Ends_With_Words {
    public static void main(String[] args) {

        String s = "MurTHY Isd a rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;

            else {
                if (w.endsWith("d"))
                    System.out.println(w);

                w = "";
            }

        }
    }


}
