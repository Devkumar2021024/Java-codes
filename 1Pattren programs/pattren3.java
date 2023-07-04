public class pattren3 {
    public static void main(String[] args) {
        int n = 7;
        // Code for D
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (row == 0 || row == (n - 1) && col > 0 && col < (n - 1) || col == 0 && row > 0 && (row < (n - 1))
                        || col == n - 1 && row > 0 && (row < (n - 1))) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            // Code for V
            for (int row = 0; row < n; row++) {
                if (row == 0 || col == 0 || col == (n - 1) / 2 && row < n - 1 || col == n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
                  System.out.print("  ");
            // Code for E
            for (int row = 0; row < n; row++) {
                if (row == 0 && col < (n-1)/2||(col-row) == (n-1)/2|| (row + col) == n-1 + (n-1)/2|| row == n-1 && col < (n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("      ");
            // Code for K
            for (int row = 0; row < n; row++) {
                if (row == 0 || row + col == (n-1)/2 || (col-row) == (n-1)/2  ) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.print("  ");
            // Code for U
            for (int row = 0; row < n; row++) {
                if (row == 0 && col < (n-1) ||(row == n-1 && col < (n-1) ) || (col == n-1) && row>0 && row<n-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            // Code for M
            for (int row = 0; row < n; row++) {
                if (row == 0 ||(row == n-1 ) || row==n-1 || row == col && row<(n+1)/2 || (row + col)==(n-1) && col <(n-1)/2){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            //Code for A
            for (int row = 0; row < n; row++) {
                if (col == 0 && (row > 0 && row < (n - 1)) || (row == 0 && col > 0) || (row == (n - 1) && col > 0)
                        || col == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print("  ");
            //Code for R
            for (int row = 0; row < n; row++) {
                if (row == 0 || col==0 && row != n-1|| col ==(n-1)/2 && row != n-1 || row == (n-1) && col > 0 && col < (n-1)/2 || col == row && row > (n-1)/2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}