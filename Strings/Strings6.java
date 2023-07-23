// Character reversal
public class Strings6 {
    public static void main(String[] args) {
        // String reversal CASE 1
        String s = "PWSKILLS";
        String n = "";

        // Initializing the index of the string
        for (int i = s.length() - 1; i >= 0; i--) {
              n = n + s.charAt(i);
        }
        System.out.println(n);
    }
}
