package others.com.src.Basic_Programs;

import java.util.Arrays;

public class SortingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Narasimha Murthy";

		char[] s2 = s1.toLowerCase().toCharArray();
		Arrays.sort(s2);

		String s3 = new String(s2);

		System.out.println(s3);
		//o/p : aaahhimmnrrstuy

	}
	
	
	

}
