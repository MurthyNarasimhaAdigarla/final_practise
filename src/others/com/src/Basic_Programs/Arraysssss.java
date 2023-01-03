package others.com.src.Basic_Programs;

public class Arraysssss {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 1;
		a[1] = 122;
		a[2] = 3;
		a[3] = 5;
		a[4] = 53;
		System.out.println(a);

		try {
			System.out.println(a[3]);
		} catch (Exception e) {
			System.out.println("no");

		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}