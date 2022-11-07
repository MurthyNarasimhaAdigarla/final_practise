public class printing_3dArray {

    public static void main(String[] args) {
        int dept, marks, students, tot = 0;
        //int marks[][][] = new int[2][3][3];
        int arr[][][] = {{{11, 12, 13,}, {21, 22, 23}}, {{25, 26, 31}, {33, 34, 35}}, {{23, 45, 46}, {46, 43, 23}}};

        for (dept = 0; dept < 3; dept++) {
            System.out.println("" + (dept + 1) + ": ");
            for (students = 0; students < 2; students++) {
                System.out.print("Students" + (students + 1) + " marks:");
                for (marks = 0; marks < 3; marks++) {
                    System.out.println(arr[dept][students][marks] + " ");
                    tot += arr[dept][students][marks];
                }
                System.out.println("Total :" + tot);//Display Total
                //marsk of a student

                tot = 0;

            }
            System.out.println();
        }


    }
}




