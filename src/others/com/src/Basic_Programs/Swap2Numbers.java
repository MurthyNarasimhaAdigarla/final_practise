package others.com.src.Basic_Programs;

import java.util.Scanner;

public class Swap2Numbers {

    static int a, b, c;


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter any 2 Values ");
        a = s.nextInt();
        b = s.nextInt();
        System.out.println("After Swaping");

      //  withTempVariable();
        withoutTempVariable();


    }


    public static void withTempVariable() {
    	c = a;
        a = b;
        b = c;

        System.out.println(a);
        System.out.println(b);

    }

    public static void withoutTempVariable() {

        a = a + b;
        b= a - b;
        a = a- b;

        System.out.println(a);
		System.out.println(b);

    }


}

