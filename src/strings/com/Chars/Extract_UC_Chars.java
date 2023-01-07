package strings.com.Chars;

public class Extract_UC_Chars {

    public static void main(String[] args) {

        String s = "MurTHY Is a 9966GOOOd BoYyyy2366";
        String new_s = "";
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                new_s += c;
        }

        System.out.println(new_s);


    }
}
