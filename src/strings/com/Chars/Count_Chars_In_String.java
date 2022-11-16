package strings.com.Chars;

public class Count_Chars_In_String {
    public static void main(String[] args) {

        String str = "This is a really simple sentence";
        int count = 0, count1 = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                count++;
            else if (c!=' ')
                count1++;


        }
        System.out.println(count + "and " + count1);

    }
}
