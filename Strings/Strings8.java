//  String and word reversal
public class Strings8 {
    public static void main(String[] args) {
        String a = "Think twice";
        String b = "";
        String c = "";

        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        String Sarr[] = b.split(" ");
        for (int j = Sarr.length - 1; j >= 0; j--) {
            c = c + Sarr[j] + " ";
        }
        System.out.println(c);
    }
}
