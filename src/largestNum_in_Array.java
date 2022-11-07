public class largestNum_in_Array {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 4, 2, 9, 88};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}
