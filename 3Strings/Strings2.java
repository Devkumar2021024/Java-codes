import java.util.Scanner;


public class Strings2 {
    public static void main(String[] args) {
        String s;
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Enter your name = ");
          s = sc.nextLine();
          //Input the string
        }
        System.out.println("Good Morining " + s);

    }
}
