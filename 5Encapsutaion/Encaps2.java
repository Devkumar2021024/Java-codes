class D{
    // Encapsulating using provate
    private int age;
    private String name;

    public void setDATA()
    {
        age = 16;
        name = "Ram";
    }
    public void call() {
        System.out.println(age + " " + name);
    }
 
}
public class Encaps2{
    public static void main(String[] args) {
        // Set DATA
        D e = new D();
        D m = new D();
        // Data set only for m object
        m.setDATA();
        m.call();
        e.call();
   }
}
