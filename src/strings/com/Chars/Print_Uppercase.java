package strings.com.Chars;

public class Print_Uppercase {

    public static void main(String[] args) {
        String s = "Murthy Is A Good BOY";
        printUppercase(s);
    }

    public static void printUppercase(String s) {

        //Char Conversion Template
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //Char Manipulation
            if (Character.isUpperCase(c))
                System.out.println(c);

        }
    }
}
