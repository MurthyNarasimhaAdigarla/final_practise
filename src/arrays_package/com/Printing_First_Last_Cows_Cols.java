package arrays_package.com;

public class Printing_First_Last_Cows_Cols {

    public static void main(String[] args) {
        //2D array
        int marks[][] = {{1, 2, 3,}, {1, 2, 5}, {3, 4, 5}};
        //looping the rows
        for (int i = 0; i < marks.length; i++) {
            //looping the columns
            for (int j = 0; j < marks[0].length; j++) {
                //Any condition
                //here first and last row and col
                if (i == 0 || j == 0 || i == marks.length - 1 || j == marks[0].length - 1)
                    System.out.print(marks[i][j] + " ");
                else
                    //printing space when printing any empty elements
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
