package collections.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection_Test {

    public static void main(String[] args) {

        ArrayList al = new ArrayList(50);
        System.out.println(al);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(null);
        System.out.println(al);
        al.add(1,2);


        System.out.println(al.size());


        List l= Collections.synchronizedList(al);
        System.out.println("pppp"+l);

    }
}
