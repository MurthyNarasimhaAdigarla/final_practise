package others.com.src.Basic_Programs;

public class EqualArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 6 };
		int b[] = { 1, 3, 5, 6 };

		if (a.length == b.length) {

			for (int i = 1; i < a.length; i++) {

				if (a[i] != b[i]) 
				{
					System.out.println(" no equal");
				} else {

					System.out.println(" equal");

				}}
		}

	}
}
