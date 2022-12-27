package searching_and_sorting;

public class Linear_Search {

    public static void main(String[] args) {
        int[] arr = {3, 6, 78, 90, 100};
        int num = 90;
        System.out.println(num + " is found at index: " + linear_search(arr, num));

    }

    private static int linear_search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i])
                return i;
        }
        return -1;
    }
}


