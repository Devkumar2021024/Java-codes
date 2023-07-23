// Write a program to print duplicate characters of a string
public class Strings13 {
    public static void main(String[] args) {
        String input = "Naural selection";
        printDuplicates(input);
    }

    public static void printDuplicates(String str) {
        int[] count = new int[256];
        // Count all the charcters of the string
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                System.out.println((char) i + " : " + count[i]);
            }
        }
    }
}
