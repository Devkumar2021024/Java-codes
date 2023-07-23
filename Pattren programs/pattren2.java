import java.util.*;

// Write a program to print a triangle
public class pattren2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n = ");
            int n = sc.nextInt();

            for (int col = 0; col < n; col++) {
                for (int row = 0; row < n - col; row++) {
                    System.out.print(" ");
                }
                for (int row = 0; row <= col; row++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

    }
}