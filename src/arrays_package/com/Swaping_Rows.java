package arrays_package.com;

public class Swaping_Rows {

    public static void main(String[] args) {
        //2D array
        int marks[][] = {{1, 2, 3,}, {4, 5, 6}, {7, 8, 9}};
        //looping the rows

        //looping the rows
        for (int row = 0; row < marks.length; row++) {
            //looping the columns
            for (int col = 0; col < marks[0].length; col++) {
                //Any condition
                //here swapping first rows into last rows
                alterArrr(marks);
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
 

        }
    }

    static void alterArrr(int marks[][]) {
        //Change according to given condition
        int row1 = 0;
        int row2 = marks.length - 1;
        for (int col = 0; col < marks[0].length; col++) {
            int temp = marks[row1][col];
            marks[row1][col] = marks[row2][col];
            marks[row2][col] = temp;


        }
    }
}


