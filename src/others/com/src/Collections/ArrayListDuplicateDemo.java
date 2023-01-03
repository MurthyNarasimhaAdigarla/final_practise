package others.com.src.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayListDuplicateDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(4);

        System.out.println(arrayList);

        HashSet<Integer> hashSet = new HashSet<>(arrayList);
        System.out.println(hashSet);


        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(arrayList);
        System.out.println(linkedHashSet);




    }
}
