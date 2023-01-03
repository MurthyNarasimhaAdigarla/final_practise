package others.com.src.Basic_Programs;

public class Strinbuffer {

	public static void main(String[] args) {
	
		
		StringBuffer s1 = new StringBuffer("Murthy");
		System.out.println(s1);
		/*StringBuffer s2 =s1.append("mm");
		System.out.println(s2);*/
		
		int s3 =s1.capacity();
		System.out.println(s3);
		
		String s4 = s1.substring(2, 4);
		System.out.println(s4);
		
		
		

	}

}
