package others.com.src.String_Programs;


import java.util.Scanner;

public class Testtt {


    public static void main(String args[]) {
        int a,no,arm = 0;


        Scanner s = new Scanner(System.in);
        System.out.println("enter");
         no = s.nextInt();
        int d = no;

        while (no > 0) {

            a = no % 10;
            no = no / 10;

            arm = arm + a * a * a;

            if (arm == d) {
                System.out.println("its armstrong");
            } else
                System.out.println("its no");


        }
    }
}
