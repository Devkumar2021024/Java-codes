// Program to check palindrome in an array

import java.util.Scanner;

public class arr1 {
    public static void main(String[] args) {
        // Array has property of random access
        // Array is static, changing its size during runtime will
        // cause Arrayoutofbound exception

        boolean ispal = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Take input of array of size = " + n);
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + i + ":: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                ispal = false;
                break;
            }
        }
        //  Time complexity = O(n)
        //  Space complexity = O(n)
        if (ispal == false) {
            System.out.println("Array is not a palindrome");
        } else {
            System.out.println("Array is a palindrome");
        }
        sc.close();
    }
}
