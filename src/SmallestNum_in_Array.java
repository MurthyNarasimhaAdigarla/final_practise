public class SmallestNum_in_Array {
    public static void main(String[] args) {
        int arr[] = new int[]{45, 7, 9, 1, 109, 1990};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min)
                min = arr[i];

        }
        System.out.println(min);
    }
}