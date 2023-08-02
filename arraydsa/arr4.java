import java.util.Scanner;

public class arr4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n + 1];

            // Read array elements
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Print array
            for (int i = 0; i <= n - 1; i++) {
                System.out.print(arr[i] + " ");
            }

            int position = sc.nextInt();
            int ins_ele = sc.nextInt();

            // shifting logic = start from last till your poisitiona nd shift the elements by one place
            for (int i = n - 1; i >= position - 1; i--) {
                arr[i + 1] = arr[i];
            }

            // overrite element at position
            arr[position - 1] = ins_ele;
            // Print array
            for (int i = 0; i <= n - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
