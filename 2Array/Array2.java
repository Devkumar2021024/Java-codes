// anonymus array and enhanced for loop 
public class Array2 {
    public static void main(String[] args) {
        sum(new int[]{1,2,3,4,5,6,7,8,9});
    }

    public static void sum(int[] a)
    {
            for(int run:a)
            {
                System.err.print(run + " ");
            }
    }
}
