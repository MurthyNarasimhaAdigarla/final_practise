package strings.com.Words;

public class Find_Longest_Word {

    public static void main(String[] args) {

        String s = "MurTHY Isd a rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";
        String lw="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;
            else {
                if(w.length()>lw.length())
                    lw=w;

                w = "";
            }
        }
        System.out.println(lw);
    }
}
