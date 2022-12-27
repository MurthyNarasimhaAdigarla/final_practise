package searching_and_sorting;

public class Binary_Search {
    int[] arr = {43, 56, 23, 677, 90};
    int num = 43;


    public static void main(String[] args) {

        Binary_Search c = new Binary_Search();
        binary_search(c.arr, c.num);

    }

    public static Object binary_search(int[] arr, int num) {

        int low = 0;
        int high = arr.length - 1;
        int flag = 0;

        do {
            int mid = (low + high) / 2;
            if (num == arr[mid]) {
                System.out.println("Record exists");
                flag = 1;
                break;
            } else if (arr[mid] < num)
                low = mid + 1;
            else
                high = mid - 1;


        }
        while (low <= high);
        if (flag == 0)
            System.out.println("Record does not exist");

        return null;
    }


}
