package arrays_package.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Array_Conversions {

    public static void main(String[] args) {


        int marks[] = {1, 2, 3, 3, 4, 55};

        String mm = Arrays.toString(marks);

        List<String> bbb = Arrays.asList(mm);

        HashSet<String> hset = new HashSet<>(bbb);
        hset.addAll(bbb);
        for (String c : hset)
            System.out.println(c);


    }
}
