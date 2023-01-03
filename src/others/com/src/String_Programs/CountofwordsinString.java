package others.com.src.String_Programs;

public class CountofwordsinString {
    public static void main(String args[])
    {

    String text = "murthy is";
    int countWords=0;

 for(int i=0; i<text.length()-1; i++)
    {
        if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
            countWords++;
    }
        System.out.println("Total number of words in string are: "+ (countWords+1));
}}