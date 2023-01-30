package arrays_package.com;

public class Remove_Dups_Array {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 50, 50,50};
        int length = arr.length;
        length = removeDuplicates(arr, length);
        //printing array elements
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");

    }

    // Function to remove duplicate elements
    // This function returns new size of modified
    // array.
    static int removeDuplicates(int[] arr, int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

}

