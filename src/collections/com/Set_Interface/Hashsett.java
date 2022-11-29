package collections.com.Set_Interface;

import java.util.HashSet;

public class Hashsett {

    public static void main(String[] args) {

        HashSet hs = new HashSet();
        hs.add(1);
        hs.add(4);
        hs.add(9);
        hs.add(100);
        hs.add("murthy");
        hs.add(90);
        hs.add(1);
        System.out.println(hs);
        System.out.println("Returns False while adding a duplicate"+hs.add(1));

    }
}
