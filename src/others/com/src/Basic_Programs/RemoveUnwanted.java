package others.com.src.Basic_Programs;

public class RemoveUnwanted {

	public static void main(String[] args) {
		
		//https://www.journaldev.com/18361/java-remove-character-string


		String s= "Abcd12hheheuh768hiwhwi12 ";
		
		String s1 =s.replaceAll("\\s", "");
		System.out.println(s1);
		
		String s2=s1.replaceAll("[^0-9]", "");
		System.out.println(s2);


		
	}
		
		 
	}


