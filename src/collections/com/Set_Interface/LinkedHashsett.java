package collections.com.Set_Interface;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashsett {

    public static void main(String[] args) {

        LinkedHashSet hs = new LinkedHashSet();
        hs.add(1);
        hs.add(4);
        hs.add(9);
        hs.add(100);
        hs.add("murthy");
        hs.add(90);
        hs.add(1);
        System.out.println(hs);
        System.out.println("Returns False while adding a duplicate ::"+hs.add(1));

    }
}
