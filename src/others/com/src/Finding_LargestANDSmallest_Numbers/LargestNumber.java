package others.com.src.Finding_LargestANDSmallest_Numbers;

import java.util.Comparator;
import java.util.stream.Stream;

public class LargestNumber {
    public static void main(String args[]) {


//Through Streams
        Integer maxNumber = Stream.of(8, 2, 5, 6, 3, 2)
                .max(Comparator.comparing(Integer::valueOf))
                .get();


        System.out.println("maxNumber is " + maxNumber);
        System.out.println("***************************************************");

        int a[] = {8, 2, 5, 6, 3, 2};
        //int a[] = {6, 3, 2};
        int temp;
        int total = a.length;
        for (int i = 0; i < total; i++) {
            for (int j = i + 1; j < total; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[total - 1]);
    }

}