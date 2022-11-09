package star_pattern.com;

public class Right_Side_Traingle {
    public static void main(String[] args) {
        int n = 3;
        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
