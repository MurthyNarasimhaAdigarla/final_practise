package others.com.src.Basic_Programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		int no, i;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any value  ");
		no = s.nextInt();

		if (no == 1) {
			System.out.println("Prime starts from 2");
			
		}
		if (no < 0){

			System.out.println("no shud be +ve");
		}

		for (i = 2; i < no; i++) {

			if (no % i == 0) {
				System.out.println("Not Prime");

				break;
			} else {
				System.out.println("Prime");
				break;
			}
		}
	}
}