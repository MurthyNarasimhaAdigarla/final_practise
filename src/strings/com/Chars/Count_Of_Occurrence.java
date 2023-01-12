package strings.com.Chars;

public class Count_Of_Occurrence {

    public static void main(String[] args) {

        String str = "geeksforgeeks";
        char c = 'e';
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            // checking character in string
            if (str.charAt(i) == c)
                res++;
        }
        System.out.println(res);


    }
}
