package strings.com.Words;

public class StringTest {

    public static void main(String[] args) {

        String s = "MurTHY Isd da rakkamma 9966GOOOd BoYyyy2366";
        s += " ";
        String newS = "";
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                newS = newS + c;
            else {
               char f=newS.charAt(0);
               char l=newS.charAt(newS.length()-1);
               String m=newS.substring(1,newS.length()-1);
               ns=ns+l+m+f+" ";


                newS = "";
            }
        }
        System.out.println(ns);
    }
}




