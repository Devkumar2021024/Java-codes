// Reverse an array

import java.util.Scanner;

public class arr2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array = ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array = ");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ":: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(" REVERSED ARRAY :: ");
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
