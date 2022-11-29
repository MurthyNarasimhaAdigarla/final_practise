package collections.com.List_Interface;

import java.util.Vector;

public class Vectorr {

    public static void main(String[] args) {

        Vector v = new Vector(1000);
        System.out.println(v.capacity());
        v.addElement(1);
        v.addElement(4);
        System.out.println(v.capacity());
        for(int i=1;i<=1000;i++)
            v.add(i);
        System.out.println(v);
        System.out.println(v.capacity());

    }





}
