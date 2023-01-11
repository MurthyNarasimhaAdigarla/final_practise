package arrays_package.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arrays_Conversions {

    public static void main(String[] args) {
        String playersArray[]
                = {"Virat", "Sachin", "Rohit", "Bumrah", "Rohit"};


        System.out.println("Array input: "
                + Arrays.toString(playersArray));


        List aa = Arrays.asList(playersArray);
        System.out.println(aa);
        Set<String> hSet = new HashSet<String>(aa);
        for (String x : hSet)
            System.out.println(x);


    }
}