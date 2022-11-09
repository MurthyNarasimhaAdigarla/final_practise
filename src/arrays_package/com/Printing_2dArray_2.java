package arrays_package.com;

public class Printing_2dArray_2 {

    //Printing 3 rows and 3 cols

    public static void main(String[] args) {
        int[][] marks = {{1, 2, 3,0,0}, {4, 5, 6,0,0}, {7, 8, 9,0,0},{14, 15, 16,10,10}};

        //System.out.println(marks.length);

        for (int i = 0; i <4; i++) {
            for (int j = 0; j <5; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
