package others.com.src.prac;

import java.util.HashSet;

public class Parent {


    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("Murthy");
        hs.add("Narasimha");
        hs.add("Adigarla");
        hs.add("Adigarla");
        hs.add(null);
        hs.add(null);


       /* System.out.println(hs);

        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/

        String[] ss = new String[hs.size()];
        hs.toArray(ss);
        for (String sss : ss
        ) {
            System.out.println(sss);

        }

     /*   hs.clear();
        System.out.println("After" + hs);*/


    }
}