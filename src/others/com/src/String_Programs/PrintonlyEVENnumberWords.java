package others.com.src.String_Programs;

public class PrintonlyEVENnumberWords {
    public static void main(String[] args) {
        String s = "i am Geeks for Geeks and a Geek";
        for (String ss : s.split(" "))
            if (ss.length() % 2 == 0) {
                System.out.println(ss);
            }

    }
}
