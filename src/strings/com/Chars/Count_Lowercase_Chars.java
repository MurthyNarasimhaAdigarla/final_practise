package strings.com.Chars;

public class Count_Lowercase_Chars {

    public static void main(String[] args) {

        String s = "Murthy IS A Good BooYYY";
        int count = 0;
        countLowercaseChars(s, count);
        count_UCChars(s, count);
    }

    private static void countLowercaseChars(String s, int count) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c))
                count++;
        }
        System.out.println("Lower case Count is :: " + count);

    }

    public static void count_UCChars(String s, int count) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c))
                count++;

        }
        System.out.println("Upper case Count is ::" + count);


    }
}