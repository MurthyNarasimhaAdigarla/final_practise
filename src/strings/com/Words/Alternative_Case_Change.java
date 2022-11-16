package strings.com.Words;

public class Alternative_Case_Change {
    public static void main(String[] args) {

        String s = "MurTHY Isd a rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";
        int count = 0;
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;
            else {
                if (count++ % 2 == 0)
                    ns = ns + w.toUpperCase() + " ";
                else
                    ns = ns + w.toLowerCase() + " ";

                w = "";
            }
        }
        System.out.println(ns);
    }
}
