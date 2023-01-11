package test.com;

import java.util.Arrays;

public class Testttt {

    public static void main(String[] args) {
        String info = "javaTpoint is the best learning website";
        char str[] = info.toCharArray();
        int len = str.length;
        removeDuplicate(str, len);
    }

    static void removeDuplicate(char str[], int length) {
        int index = 0;
        for (int i = 0; i < length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }

            // If the character is not present before, add it to resulting string
            if (j == i) {
                str[index++] = str[i];
            }
        }
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }
}

