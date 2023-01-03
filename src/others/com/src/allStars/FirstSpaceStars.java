package others.com.src.allStars;

public class FirstSpaceStars {
    public static void main(String[] args) {

        int i,j,n=5;
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        int rows = scanner.nextInt();*/
        System.out.println("## Printing the pattern ##");
        for (i = 1; i<=n; i++) {
            for ( j = n-i; j > 0; j--) {
                System.out.print(" ");
            }
            for( j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        } }}
