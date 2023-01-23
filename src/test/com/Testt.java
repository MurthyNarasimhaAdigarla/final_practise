package test.com;

import java.util.*;

public class Testt {

    public static void main(String[] args) {


        String arr[] = {"San Jose", "Dallas", "Chicago","Chicago", "San Antonio", "Los Angeles", "Portland", "Tucson"};
        //prints the Array
        System.out.println("Array before conversion: " + Arrays.toString(arr));
        //method calling
        Set<String> list = ArrayToListConversion(arr);
        //print the List
        System.out.println("Array after conversion: " + list);
    }

    //creating a generic function that converts the Array into List
    public static <T> Set<T> ArrayToListConversion(T arr[]) {
        //creating the constructor of thr List class
        Set<T> list = new TreeSet<>();
        //the method adds Array to the List
        Collections.addAll(list, arr);
        //returns the list
        return list;
    }
}