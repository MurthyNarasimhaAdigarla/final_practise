package strings.com.Chars;

public class Count_Of_Chars {

    public static void main(String[] args) {

        String s = "Murthy is a Good boyeeee";
        //Useful When finding count of something
        int count = 0;
        //Useful When creating something in a New String
        String sn = "";

        // Dividing a String into Character Logic
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //Main Logic
            if (c != ' ')
                count++;
        }
        System.out.println(count);

    }
}
