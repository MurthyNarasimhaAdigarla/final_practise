package arrays_package.com;

public class Printing_Specified_Rows_Cols {

    public static void main(String[] args) {
        int marks[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < marks.length; i++) {

            for (int j = 0; j < 3; j++) {
                //Printing only Cols
                if(j==0||j== marks.length-1)
                    System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }


    }
}

