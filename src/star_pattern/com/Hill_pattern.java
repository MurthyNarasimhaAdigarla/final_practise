package star_pattern.com;

public class Hill_pattern {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {

            //decreasing Spaces
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            //increasing stars, replace "j <i" with "j <= i" for extra column in hill pattern
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            //increasing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }

    }
}
