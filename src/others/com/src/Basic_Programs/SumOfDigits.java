package others.com.src.Basic_Programs;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no, sum = 0, a;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter eny num");
		no = s.nextInt();
		while (no > 0) {
			a = no % 10;
			no = no / 10;
			sum = sum + a;
		}
		System.out.println(sum);

	}

}
