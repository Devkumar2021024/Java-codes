public class pattren4 {

    public static void main(String[] args) {
        int n = 13;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row + col <= (n - 1) / 2 && col < (n - 1) / 2 || col - row >= (n - 1) / 2 || col == 0
                        || row == n - 1 ||
                        col == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}