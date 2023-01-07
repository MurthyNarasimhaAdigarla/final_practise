package arrays_package.com;


public class Second_Largest_Num_In_Array {

    public static void main(String[] args) {
        int[] marks = {2, 5, 5, 70, 4, 490, 560, 890, 550};
        System.out.println(second(marks));
    }

    public static int second(int[] marks) {
        int temp;
        int length = marks.length;
        for (int i = 0; i < marks.length; i++) {
            for (int j = i + 1; j < marks.length; j++) {

                if (marks[i] > marks[j]) {
                    temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                }
            }
        }
        return marks[length -1];

    }


}
