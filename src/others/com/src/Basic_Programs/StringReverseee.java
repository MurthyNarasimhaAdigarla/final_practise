package others.com.src.Basic_Programs;

public class StringReverseee {

	public static void main(String[] args) {

		String original = "Murthy", reverse = "";

		/*
		 * String input = "GeeksForGeeks";
		 * 
		 * // convert String to character array // by using toCharArray
		 * 
		 *  char[] try1 = input.toCharArray();
		 * 
		 * for (int i = try1.length-1; i>=0; i--) System.out.print(try1[i]);
		 */

		/*
		 * int length = original.length(); System.out.println(length);
		 * 
		 * for (int i = length - 1; i >= 0; i--) reverse = reverse + original.charAt(i);
		 * System.out.println("Reverse of the string: " + reverse);
		 */

		char[] strArray = original.toCharArray();

		for (int i = strArray.length - 1; i >= 0; i--)

			// Output : avaJyM

			System.out.print(strArray[i]);
	}

}
