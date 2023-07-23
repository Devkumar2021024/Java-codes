// Character reversal
public class Strings7 {
    public static void main(String[] args) {
        String one = "Master string";
        String two = "";
        String Sarr[] = one.split(" ");
    
        for(int i = Sarr.length-1; i>=0; i--)
        {
            two = two + Sarr[i] + " ";
        }
        System.out.println(two);    
    }
    
}
