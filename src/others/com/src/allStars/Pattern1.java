package others.com.src.allStars;

public class Pattern1 {

	public static void main(String args[]) {

		int i, j;

		//rows
		for (i = 1; i <= 5; i++) {
			//Cols
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
	}
}