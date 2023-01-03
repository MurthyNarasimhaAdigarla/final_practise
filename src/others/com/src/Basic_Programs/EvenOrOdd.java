package others.com.src.Basic_Programs;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        int a;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any Value  ");
        a = s.nextInt();
        if (a % 2 == 0) {

            System.out.println(a + " is even Number");

        } else
            System.out.println(a + " is odd Number");
    }

}
