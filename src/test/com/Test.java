package test.com;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        String playersArray[]
                = {"mmm", "kkkk", "frfgf"};


//        List<String> list = Arrays.asList(Arrays.toString(playersArray));
//        System.out.println(list);
//
//        Set<String> set = new TreeSet<>(list);
//        System.out.println(set);

        List<String> ll = new ArrayList<>();
//        Collections.addAll(ll, playersArray);
//        System.out.println(ll);

        for (String str : playersArray) {
            ll.add(str);


        }
        System.out.println(ll);


    }
}