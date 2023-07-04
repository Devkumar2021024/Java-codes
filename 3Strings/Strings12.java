// Remove duplicates form a string 
public class Strings12 {
    public static void main(String[] args) {
        String input = "hello world";
        String output = removeDuplicates(input);
        System.out.println(output);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}