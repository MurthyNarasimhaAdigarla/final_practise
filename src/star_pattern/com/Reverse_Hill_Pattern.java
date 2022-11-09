package star_pattern.com;

public class Reverse_Hill_Pattern {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= n; i++) {
            //increasing Space
            for (int j = 1; j <= i; j++) {
                System.out.print("a ");
            }
            //decreasing Stars
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            //Decreasing Stars
            for (int j = i; j <= n; j++) {
                System.out.print("m ");
            }


            System.out.println(" ");
        }


    }
}
