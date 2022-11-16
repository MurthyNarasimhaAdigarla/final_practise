package strings.com.Words;

public class Swap_Last_And_First_Char {
    public static void main(String[] args) {

        String s = "MurTHY Isd da rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;
            else {
                char f=w.charAt(0);
                char l=w.charAt(w.length()-1);
                String m=w.substring(1,w.length()-1);
                ns=ns+l+m+f+" ";
                w = "";
            }
        }
        System.out.println(ns);
    }
}
