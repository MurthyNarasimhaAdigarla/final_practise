package arrays_package.com;

public class Replacing_Neg_Values_By_Zero {

    public static void main(String[] args) {
        //2D array
        int marks[][] = {{1, 2, -3,}, {1, -2, 5}, {3, 4, 5}};
        //looping the rows
        for (int row = 0; row < marks.length; row++) {
            //looping the columns
            for (int col = 0; col < marks[0].length; col++) {
                //Any condition
                //here replacing -ve values into zeros
                if (marks[row][col] < 0)
                    marks[row][col] = 0;
                System.out.print(marks[row][col] + " ");

            }
            System.out.println();
        }

    }
}
