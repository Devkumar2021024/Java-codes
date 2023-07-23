public class pattren5 {
    public static void main(String[] args) {
        int n = 7;
        for (int col = 0; col < n; col++) {
            // Code for P
            for (int row = 0; row < n; row++) {
                if (row == 0 || col == 0 && row != n - 1 || col == (n - 1) / 2 && row != n - 1
                        || row == (n - 1) && col > 0 && col < (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            // Code for W
            for (int row = 0; row < n; row++) {
                if (row == 0 || row == n - 1 || (row) + col + 1 == n && col > ((n - 1) / 2) - 1
                        || col == row && row > ((n - 1) / 2) - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        System.out.println();
        for (int col = 0; col < n; col++) {

            // Code for S
            for (int row = 0; row < n; row++) {
                if (row == 0 && col < (n - 1) / 2 && col > 0 || col == 0 && row > 0 || col == n - 1 && row < n - 1
                        || col == (n - 1) / 2 && row > 0 && row < n - 1
                        || row == n - 1 && col > (n - 1) / 2 && col < n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();
        for (int col = 0; col < n; col++) {

            // Code for K
            for (int row = 0; row < n; row++) {
                if (row == 0 || row + col == (n - 1) / 2 || (col - row) == (n - 1) / 2) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        System.out.println();
        for (int col = 0; col < n; col++) {

            // Code for I
            // Code for I
            for (int row = 0; row < n; row++) {
                if (row == (n - 1) / 2 || col == 0 || col == n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();

        }
        System.out.println();
        for (int col = 0; col < n; col++) {

            // Code for S
            // Code for L
            for (int row = 0; row < n; row++) {
                if (row == 0 || col == n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("");
                }
            }

            System.out.println();

        }
        System.out.println();
        for (int col = 0; col < n; col++) {

            // Code for L
            for (int row = 0; row < n; row++) {
                if (row == 0 || col == n - 1) {
                    System.out.print("*  ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();
        for (int col = 0; col < n; col++) {

            // Code for S
            for (int row = 0; row < n; row++) {
                if (row == 0 && col < (n - 1) / 2 && col > 0 || col == 0 && row > 0 || col == n - 1 && row < n - 1
                        || col == (n - 1) / 2 && row > 0 && row < n - 1
                        || row == n - 1 && col > (n - 1) / 2 && col < n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
}
