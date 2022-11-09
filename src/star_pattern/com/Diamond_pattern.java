package star_pattern.com;

public class Diamond_pattern {
    public static void main(String[] args) {
        int n = 5;
        // Here in below first for loop condition we are making some changes by printing only single row by replacing "i <= n" with "i < n"
        for (int i = 1; i < n; i++) {
            //decreasing Spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            //increasing Stars with single column
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            //increasing Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            //Increasing Spaces
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            //decreasing Stars
            for (int j = i; j <= n; j++) {
                System.out.print("* ");
            }
            //decreasing Stars
            for (int j = i; j <= n; j++) {
                System.out.print("* ");

            }
            System.out.println("");
        }


    }
}