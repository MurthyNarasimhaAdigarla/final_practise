package others.com.src.Basic_Programs;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int i, no;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter any num ");
		no = s.nextInt();
		System.out.println("Entered num is " + no);
		System.out.println("Table of " + no + " is");
		for (i = 0; i <= 10; i++) {

			System.out.println(no + "*" + i + "=" + no * i);

		}

		s.close();

	}

}
