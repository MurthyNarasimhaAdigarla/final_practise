package others.com.src.Int_programs;

import java.util.Scanner;

public class CheckPrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter any Number");
        int no = s.nextInt();
        if (no % 2 != 0) {
            System.out.println("Prime");

        } else {
            System.out.println(" not Prime");

        }

    }}

