package strings.com.Words;

public class Remove_Extra_Chars {

    public static void main(String[] args) {


        String s = "asdf123$%^qwerty";
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        String Output = "";
        //String s=" ";


        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (!Character.isDigit(c))
                Output = Output + c;


        }
        System.out.print(Output);


    }

}
