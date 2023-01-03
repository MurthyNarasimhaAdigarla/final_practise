package others.com.src.String_Programs;

public class CheckForWhiteSpaces {

    public static boolean checkforWhiteSpaces(String str) {

        if (str.trim().isEmpty())
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        String s1 = " ";
        String s2 = "Murthy";
        System.out.println(checkforWhiteSpaces(s1));
        System.out.println(checkforWhiteSpaces(s2));


    }

}
