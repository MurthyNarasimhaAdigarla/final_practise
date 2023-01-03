package others.com.src.Basic_Programs;

import java.io.FileOutputStream;

public class TypeN {
	static int i;
	static int j;

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("F:\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("success...");
			}catch (Exception e) {
			System.out.println(e);
		}}}