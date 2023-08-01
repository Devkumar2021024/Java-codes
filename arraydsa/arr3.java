// Euclid algorithm

import java.util.Scanner;

public class arr3 {

    public static int gcd(int a, int b) {
        while (a != 0) {
            int A = b % a;
            int B = a;
            a = A;
            b = B;
        }
        return b;
    }

    public static int GCDofNnos(){
         try (Scanner scan = new Scanner(System.in)) {
            int n = scan.nextInt();
             int ans = scan.nextInt();

             for(int i =1; i<n; i++){
                int num = scan.nextInt();
                ans = gcd(ans, num);
             }
     return ans;
        }
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int T = scan.nextInt();

            for (int i = 0; i < T; i++) {
                System.out.println(GCDofNnos());
             }
        }
      
    }
}
