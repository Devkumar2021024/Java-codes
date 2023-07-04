// Pallindrome
public class Strings9 {
    public static void main(String[] args) {
        String a = "2552";
        String b = "";

        for(int  i =a.length()-1; i>=0; i--){
               b = b + a.charAt(i);
    }

    if(a.equals(b))
    {
      System.out.println("YES, " + a + " is a Pallindrome");
    }
    else{
        System.out.println("Not pallindrome");
    }
}
}

