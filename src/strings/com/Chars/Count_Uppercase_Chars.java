package strings.com.Chars;

public class Count_Uppercase_Chars {
    public static void main(String[] args) {
        String s = "Murthy IS A Good BoYYY";
        int count = 0;
        count_UCChars(s,count);


    }

    public static void count_UCChars(String s, int count) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                count++;

        }
        System.out.println(count);
    }}
