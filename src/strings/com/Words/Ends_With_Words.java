package strings.com.Words;

public class Ends_With_Words {
    public static void main(String[] args) {

        String s = "MurTHY Isd a rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String sn = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                sn = sn + c;

            else {
                if (sn.endsWith("d"))
                    System.out.println(sn);

                sn = "";
            }

        }
    }


}
