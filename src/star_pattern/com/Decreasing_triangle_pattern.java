package star_pattern.com;

public class Decreasing_triangle_pattern {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println("\t");
        }

    }
}
