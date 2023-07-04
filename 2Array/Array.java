public class Array {
    public static void main(String[] args) {
        int[][] a;
        a = new int[6][6];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
