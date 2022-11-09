package arrays_package.com;

public class ReverseArray {

    public static void main(String[] args) {

        int arr[] = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println("Printing in Reverse ");

        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j] + " ");
        }


    }
}
