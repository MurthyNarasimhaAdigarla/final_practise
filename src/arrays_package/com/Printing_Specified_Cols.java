package arrays_package.com;

public class Printing_Specified_Cols {


    //Printing the specified rows and columns in any *square matrix*
    //Printing the first and last column in square matrix
    public static void main(String[] args) {
        int marks[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < marks.length; i++) {

            for (int j = 0; j < 3; j++) {
                //we can change any specified rows and cols by just printing the if condition
                if (j == 0 || j == marks.length - 1)
                    System.out.print(marks[i][j] + " ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    }


}
