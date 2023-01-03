package others.com.src.Finding_LargestANDSmallest_Numbers;

public class SecondSmallestNumber {

    public static void main(String[] args) {


        int a[] = {7, 6, 8};
        int temp;
        int size = a.length;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }

        System.out.println(a[1]);

    }
}
