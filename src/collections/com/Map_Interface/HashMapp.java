package collections.com.Map_Interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {

    public static void main(String[] args) {

        Map<String,Integer> hm =new HashMap<>();
        hm.put("One",1);
        hm.put("Two",2);
        hm.put("Three",3);
        hm.put("Four",4);
        hm.put("Five",5);
        hm.put("Five",6);
        System.out.println(hm.keySet());

        System.out.println(hm);
    }
}
