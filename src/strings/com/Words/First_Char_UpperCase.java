package strings.com.Words;

public record First_Char_UpperCase() {
    public static void main(String[] args) {

        String s = "MurTHY Isd a rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;
            else {
                char f=w.charAt(0);
                f=Character.toUpperCase(f);
                ns=ns+f+w.substring(1)+" ";

                w = "";
            }
        }
        System.out.println(ns);
    }
}
