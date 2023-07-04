

// Anagram in java
// public class Strings10 {
//     public static void main(String[] args) {
//         String s1 = "School Master";
//         String s2 = "The ClassRooM";

//         s1 = s1.replace(" ", "");
//         s2 = s2.replace(" ", "");

//         // Conversion to lowercase
//         s1 = s1.toLowerCase();
//         s2 = s2.toLowerCase();
//         // Conversion to character array
//         char[] x = s1.toCharArray();
//         char[] y = s2.toCharArray();
//         // Sorting character array
//         Arrays.sort(x);
//         Arrays.sort(y);

//         if (Arrays.equals(x, y)) {
//             System.out.println("It's an Anagram");
//         } else {
//             System.out.println("Its not an Anagram");
//         }
//     }
// }

public class Strings10{
public static void main(String[] args) {
    String s1 = "School Master";
    String s2 = "The ClassRooM";
    boolean result = isAnagram(s1, s2);
    System.out.println(result);
}

public static boolean isAnagram(String s1, String s2) {
    s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();
    int[] count = new int[256];
    for (int i = 0; i < s1.length(); i++) {
        count[s1.charAt(i)]++;
        count[s2.charAt(i)]--;
    }
    for (int i = 0; i < count.length; i++) {
        if (count[i] != 0) {
            return false;
        }
    }
    return true;
}
}