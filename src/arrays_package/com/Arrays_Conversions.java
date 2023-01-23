package arrays_package.com;

import java.util.*;

public class Arrays_Conversions {

    public static void main(String[] args) {
        String playersArray[]
                = {"Virat", "Sachin", "Rohit", "Bumrah", "Rohit"};

        // Method 1
        List<String> list = Arrays.asList(playersArray);
        System.out.println(list);


        // Method 2
        List<String> ll = new ArrayList<>();
        Collections.addAll(ll, playersArray);
        System.out.println(ll);

        // Method 3
        List<String> dl = new ArrayList<>();
        for (String str : playersArray) {
            dl.add(str);


        }
        System.out.println(ll);


        //4
        //converting the list To  Set

        Set<String> setString = new TreeSet<>(dl);
        System.out.println(setString);


    }
}