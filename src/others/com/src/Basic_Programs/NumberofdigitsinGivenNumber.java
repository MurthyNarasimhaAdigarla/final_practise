
package others.com.src.Basic_Programs;

import java.util.Scanner;

public class NumberofdigitsinGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no, a = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number : ");
		no = s.nextInt();

		if (no < 0) {
			no = no * -1;
			
		} 
		else if (no == 0) {
			no = 1;
		}
		while (no > 0) {
			no = no / 10;
			a++;
		}
		System.out.println("Number of Digits in given number is: " + a);
	}
}