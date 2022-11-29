package arrays_package.com;

public class Alter_Rows_By_Specifying_RowNo {


             //   7 8 9
             //   4 5 6
             //   1 2 3

            //Index placing Template
            //00 01 02
            //10 11 12
            //20 11 22

    //Printing the specified rows and columns in any *square matrix*
    //Printing the all elements by multiplying with 10
    public static void main(String[] args) {
        int marks[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        alterRowsBySpecifyingRowNo(marks);

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }


    }

    static void alterRowsBySpecifyingRowNo(int marks[][]) {

        //Specify the rows no which you want to change
        int row0 = 0;
        int row2 = 1;
        for (int j = 0; j < 3; j++) {
            //Logic is :swapping the rows by taking temp variable
            int temp = marks[row0][j];
            marks[row0][j] = marks[row2][j];
            marks[row2][j] = temp;
        }
        System.out.println();
    }
}



