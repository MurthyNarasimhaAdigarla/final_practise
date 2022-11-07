import java.util.Scanner;

public class Transpose_Matrix {
    public static void main(String[] args) {
        //use scanner to accept data from keyboard
        Scanner sc = new Scanner(System.in);
        //accept rows and cols for a matrix
        System.out.println("Enter the values for rows and cols:: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        //Creating an array with size r and c
        int arr[][] = new int[r][c];
        //accept a matrix from keyboard
        System.out.println("Enter the elements of matrix:: ");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();





        System.out.println("The transpose matrix:: ");
        for (int i = 0; i < c; i++)
        {
            for (int j = 0; j < r; j++) {
                System.out.print(arr[j][i] + " ");

            }
            System.out.print("\n");
        }

    }
}
