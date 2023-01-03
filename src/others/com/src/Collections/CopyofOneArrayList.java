package others.com.src.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class CopyofOneArrayList {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        System.out.println( "MM   "  +  Collections.frequency(arrayList,4));

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(90);
        arrayList1.add(40);


        arrayList1.addAll(arrayList);
        System.out.println(arrayList1);



    }
}