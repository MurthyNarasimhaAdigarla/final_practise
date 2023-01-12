// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;

class Testttt {
    public static void main(String[] args) {
        String strr = "Hello";

        char str[] = strr.toCharArray();
        removeDup();


    }

    public static String removeDup(str[]) {

        int index = 0;
        for (int i = 0; i < strr.length(); i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;

                }


            }


            if (j == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }
}