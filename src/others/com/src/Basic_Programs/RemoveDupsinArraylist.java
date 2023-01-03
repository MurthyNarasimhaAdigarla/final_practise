package others.com.src.Basic_Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDupsinArraylist {

	public static void main(String[] args) {
		// Constructing An ArrayList

		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("J2EE");

		listWithDuplicateElements.add("JSP");

		listWithDuplicateElements.add("SERVLETS");

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("STRUTS");

		listWithDuplicateElements.add("JSP");

		// Printing listWithDuplicateElements

		System.out.print("ArrayList With Duplicate Elements :");
		System.out.println(listWithDuplicateElements);

		LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
		System.out.println(set);

	}
}