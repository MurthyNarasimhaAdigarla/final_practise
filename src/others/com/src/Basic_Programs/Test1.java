package others.com.src.Basic_Programs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

abstract class Test1 {

	public static void main(String[] args) throws IOException {

		
		//To create a file with given name and path
		File file = new File("E://Java_Files//MurthyText1.txt");
		
		// Checking the file existing or not
		if (file.createNewFile()) {
			System.out.println("File is created!");
		} else {
			System.out.println("File already exists.");
		}

		// Write Content
		FileWriter writer = new FileWriter(file);
		writer.write("Person data");
		writer.close();
		
		//2
		String data = "Person data";
		FileOutputStream fileoutputstream = new FileOutputStream("E://Java_Files//MurthyText2.txt");
		fileoutputstream.write(data.getBytes());
		fileoutputstream.close();

	

	}

}
