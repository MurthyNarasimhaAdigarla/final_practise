package star_pattern.com;

public class Increasing_triangle_pattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("\t");
        }

    }
}
