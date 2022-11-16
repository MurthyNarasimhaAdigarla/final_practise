package strings.com.Words;

public class Count_Of_Words {

    public static void main(String[] args) {

        String s = "MurTHY Isd a rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String w = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w = w + c;
            else {
                System.out.println(w);
                count++;

                w = "";
            }
        }
        System.out.println(count);
    }
}
