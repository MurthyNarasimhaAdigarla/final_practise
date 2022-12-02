package collections.com.Map_Interface;

import java.util.TreeMap;

public class TreeMapp {
    public static void main(String[] args) {
        TreeMap tm =new TreeMap();
        tm.put(100,"zzz");
        tm.put(200,"eee");
        tm.put(300,"dddd");
        tm.put(500,"ffff");
        tm.put("ddd",9090);//CCE
        tm.put(null,"666");//NPE
        System.out.println(tm);

    }
}
