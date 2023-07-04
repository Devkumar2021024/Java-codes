public class Static1 {
    static int a = 100;
    static {
        System.out.println("Static block first" + " " + a);
    }

    static void display()
    {
        System.out.println("static display method");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
}
