package others.com.src.Finding_LargestANDSmallest_Numbers;

public class Second_LargestNumber {

    public static void main(String[] args) {

        int a[] = {6, 3, 2};
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
        System.out.println(a[size - 2]);









    }


}
