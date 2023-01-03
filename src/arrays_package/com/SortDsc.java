package arrays_package.com;

class SortDsc {
    public static void main(String[] args) {

        //1D Array Template
        int arr[] = {41, 14, 8, 3, 10};
        for (int i = 0; i < arr.length; i++) {

        }
        //SORTING TEMPLATE
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}


