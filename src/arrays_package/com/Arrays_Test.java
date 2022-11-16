package arrays_package.com;

public class Arrays_Test {


    //Printing the specified rows and columns in any *square matrix*
    //Printing the all elements by multiplying with 10
    public static void main(String[] args) {
        int marks[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < marks.length; i++) {

            for (int j = 0; j < 3; j++) {
                //we can change any specified rows and cols by just printing the if condition
                //Logic is : Multiplying with 10 before Printing the array
                System.out.print(marks[i][j] * 10 + " ");

            }
            System.out.println();
        }


    }


}
