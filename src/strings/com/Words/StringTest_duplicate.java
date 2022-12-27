package strings.com.Words;

public class StringTest_duplicate {
    public static void main(String[] args) {

        String s = "Murthy is a gooyyyyd Boy";
        s += " ";
        String w = "";
        String ns = "";

        // Dividing a String into WORD Logic
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                w += c;
            else {
                if (!w.equals("is"))
                    ns = ns + w + " ";
                w = "";
            }
        }
        System.out.println(ns);
    }
}