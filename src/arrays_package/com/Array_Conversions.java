package arrays_package.com;

import java.util.*;

public class Array_Conversions {

    public static void main(String[] args) {


        int marks[] = {1, 2,10,12, 3, 3, 4, 55};

        String mm = Arrays.toString(marks);

        List<String> bbb = Arrays.asList(mm);

        Set<String> hset = new TreeSet<>(bbb);
        hset.addAll(bbb);
        for (String c : hset)
            System.out.println(c);


    }
}
