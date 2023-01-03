package others.com.src.Basic_Programs;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, no, first = 0, second = 1, next;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter any num ");
		no = s.nextInt();
		first = 0;
		second = 1;
		for (i = 0; i < no; i++) {
			System.out.println(first);
			next = first + second;
			first = second;
			second = next;

		}

	}

}
