package others.com.src.Basic_Programs;

import java.util.Scanner;


/*
153= 1^3 + 5^3 + 3^3 =153
*
* */

public class Armstrongnumber {

	public static void main(String[] args) {

		int a, no, arm = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any num "); // 371,153
		no = s.nextInt();
		int d = no;

		while (no > 0) {                  
			a = no % 10; // 1
			no = no / 10; // 37
			arm = arm + a * a * a;
		}
		if (arm == d) {
			System.out.println("its is");
		} else
			System.out.println("no");
	}

}
