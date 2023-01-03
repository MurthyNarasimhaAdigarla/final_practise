package others.com.src.Basic_Programs;

public class Stringss {

	public static void main(String[] args) {

		// String
		String s1 = "Mueerthy";
		String s2 = new String("Murthyy");

		char ch[] = { 'M', 'u', 'r', 't', 'h', 'y', 'y', 'y' };
		String s3 = new String(ch);

		System.out.println(s1);

		System.out.println(s2);

		System.out.println(s3);

		int charindex = s1.charAt(1);
		System.out.println("charindex" + charindex);
		
		int length =s2.length();
		System.out.println(length);

		String s = s1.substring(2);
		System.out.println("Substing   " + s);
		

		String ws = s1.trim();
		System.out.println("trim is  " + ws);
		
		

	}

}
