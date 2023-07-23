//Write a program to count the number of vowels, consonants and special characters in a string
public class Strings14 {
    public static void main(String[] args) {
        String input = "My name is dev";
        countCharacters(input);
    }

    public static void countCharacters(String str) {
        int vowels = 0;
        int consonants = 0;
        int specialChars = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c)) {
                if ("aeiouAEIOU".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else {
                specialChars++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);
    }

}
