// public class Strings5 {
//     public static void main(String[] args) {
//         String s = "JAVA";
//         String p ="JAVA";

//         System.out.println(p == s);
//         System.out.println(s.equals(p));
//     }
// }

// public class Strings5 {
//     public static void main(String[] args) {
//         String word = "umbrella";
//         boolean containsE = word.contains("e");
//         if (containsE) {
//             System.out.println("The word '" + word + "' contains the letter 'e'");
//         } else {
//             System.out.println("The word '" + word + "' does not contain the letter 'e'");
//         }
//     }
// }

//Write a program to delete all the consonants from string “Hello, have a good day”
public class Strings5 {
    public static void main(String[] args) {
        String str = "Hello, have a good day";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U') {
                sb.append(c);
            }
        }
        String result = sb.toString();
        System.out.println("The original string: " + str);
        System.out.println("The string without consonants: " + result);
    }
}