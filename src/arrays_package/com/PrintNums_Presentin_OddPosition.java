package arrays_package.com;

public class PrintNums_Presentin_OddPosition {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length; i = i + 2) {


            System.out.println(arr[i] + "");

        }


    }
}
