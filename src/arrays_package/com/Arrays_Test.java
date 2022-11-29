package arrays_package.com;

public class Arrays_Test {


    //Printing the specified rows and columns in any *square matrix*
    //Printing the all elements by multiplying with 10
    public static void main(String[] args) {
        int marks[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum=0;

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < 3; j++) {

                sum+=marks[i][j];
            }
            System.out.println(sum);
        }
    }
}


//        7 8 9
//        4 5 6
//        1 2 3


//00 01 02
//10 11 12
//20 11 22