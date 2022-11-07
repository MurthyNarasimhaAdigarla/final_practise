public class Printing_2dArray {

    //Printing 3 rows and 3 cols

    public static void main(String[] args) {
        int[][] marks = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //System.out.println(marks.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(marks[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
