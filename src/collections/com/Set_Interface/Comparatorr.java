package collections.com.Set_Interface;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparatorr {
    public static void main(String[] args) {

        TreeSet t = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                if (i1 < i2)
                    return +1;
                else if (i1 > i2)
                    return -1;
                else
                    return 0;


             }
        });


        t.add(1);
        t.add(4);
        t.add(89);
        t.add(45);
        t.add(32);
        t.add(325);
        //t.add("murthy");
        //t.add(null);

        System.out.println(t);
    }
}
