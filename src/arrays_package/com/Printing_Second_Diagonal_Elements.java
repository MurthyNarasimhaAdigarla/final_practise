package arrays_package.com;

public class Printing_Second_Diagonal_Elements {


    //Printing the specified rows and columns in any *square matrix*
    //Printing the Diagonal elements in square matrix
    public static void main(String[] args) {
        int marks[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < marks.length; i++) {

            for (int j = 0; j < 3; j++) {
                //we can change any specified rows and cols by just printing the if condition
                //Logic is : row + col index value == marks[0].length-1
                if (i + j == marks[0].length - 1)
                    System.out.print(marks[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }


    }


}
