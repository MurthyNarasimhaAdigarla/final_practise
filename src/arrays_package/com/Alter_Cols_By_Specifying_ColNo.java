package arrays_package.com;

public class Alter_Cols_By_Specifying_ColNo {


    //Printing the specified rows and columns in any *square matrix*
    //Printing the all elements by multiplying with 10
    public static void main(String[] args) {
        int marks[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        alterColsBySpecifyingColNo(marks);

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + " ");
        }
            System.out.println();
        }
    }

    static void alterColsBySpecifyingColNo(int marks[][]) {
        //Specify the rows no which you want to change
        int col0 = 0;
        int col2 = marks.length - 1;
        for (int i = 0; i < marks.length; i++) {
            //Logic is :Swapping the Cols by taking temp variable
            int temp = marks[i][col0];
            marks[i][col0] = marks[i][col2];
            marks[i][col2] = temp;
        }
        System.out.println();
    }
}


                //        7 8 9
                //        4 5 6
                //        1 2 3


                        //00 01 02
                        //10 11 12
                        //20 11 22