package arrays_package.com;

public class RotateRight {
    public static void main(String[] args) {

        int arr[] = new int[]{1, 6, 3, 8, 9};
        int n = 1;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        for (int i = 0; i < n; i++) {
            int j, last;
            last = arr[arr.length - 1];
            for (j = arr.length - 1; j > 0; j--) {
                //Shift element of array by one
                arr[j] = arr[j - 1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;

        }
        System.out.println();

        //Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}