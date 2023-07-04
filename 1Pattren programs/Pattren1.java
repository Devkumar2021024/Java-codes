 //Write a program to print ABCDEFGH in JAVA
 public class Pattren1 {
    public static void main(String[] args) {
        int n = 7;
        // code for A
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col == 0 && (row > 0 && row < (n - 1)) || (row == 0 && col > 0) || (row == (n - 1) && col > 0)
                        || col == (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // Code for B
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (col == 0  && row < (n - 1) || row == 0 || col == (n-1)/2 && row < (n-1) || col == (n-1) && row < (n-1) || row ==(n-1) && col>0 && col <(n-1) && col != (n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        // Code for C
        for (int col = 0; col < n; col++) {
            for (int row = 0; row < n; row++) {
                if (row == 0 && col >0 && col < n-1 || col == 0 && row != 0 || col == (n-1) && row > 0) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
    System.out.println();
    // Code for D
    for (int col = 0; col < n; col++) {
        for (int row = 0; row < n; row++) {
            if (row == 0 || row == (n-1) && col > 0 && col < (n-1) || col == 0 && row > 0 && (row < (n-1)) || col == n-1 && row > 0 && (row < (n-1))) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
}
System.out.println();


    // Code for E
    for (int col = 0; col < n; col++) {
        for (int row = 0; row < n; row++) {
            if (row == 0 || col == 0  ||  col == (n-1)/2 && row < n-1||  col == n-1 ) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
}
System.out.println();


       // Code for F
    for (int col = 0; col < n; col++) {
        for (int row = 0; row < n; row++) {
            if (row == 0 || col == 0 ||  col == (n-1)/2 && row < n-1) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
}
System.out.println();


     // Code for G
    for (int col = 0; col < n; col++) {
        for (int row = 0; row < n; row++) {
            if (row == 0 && col > 0 && col < n-1 || col == 0 && row > 0 && row < (n-1) || col == (n-1) && row > 0 && row < (n-1) || row == (n-1) && col > (n-1)/2 && col != (n-1) || col == 4 && row > 3)  {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
}
System.out.println();


// Code for H
for (int col = 0; col < n; col++) {
    for (int row = 0; row < n; row++) {
        if (row == 0 || row == (n-1) || col == (n-1)/2)  {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}
System.out.println();
}
}
