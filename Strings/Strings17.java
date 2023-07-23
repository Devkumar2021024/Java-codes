public class Strings17 {
    
    public static void main(String[] args) {
        boolean pangram = true;

        String s = "The quick brown fox jumps over the lazy dog";
        // Total number of alphabest = 26
        boolean[] mark_index = new boolean[26];
        int count = 0;
        // Remove void spaces
        s = s.replaceAll(" ", "");
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);

            // Handling capital letters
            if (c >= 'A' && c <= 'Z') {
                // Returning index value
                count = c - 'A';
            } else if (c >= 'a' && c <= 'z')// HAndling lower case
            {
                count = c - 'a';
            }

            mark_index[count] = true;
        }

        // Checking if all marks are corect or not
        for(int i = 0; i<mark_index.length; i++)
        {
                if(mark_index[i] ==  false)
                           pangram = false;
        }

        // Checking main condition 
        if(pangram){
            System.out.println("Yes string is a pangram.");
        }
        else{
            System.out.println("Sorry! s is not a pamgram.");
        }
    }

}
