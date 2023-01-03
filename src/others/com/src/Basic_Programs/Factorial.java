package others.com.src.Basic_Programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int no;
		int fect = 1;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any num ");
		no = s.nextInt();
		for (int i = 1; i <= no; i++) {
			fect = fect * i;
		}

		System.out.println("Factorial is :" + fect);
	}
}
