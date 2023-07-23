// Manual making of object and calling 
public class Encaps1 {
    int age;
    String name;

    public void call() {
        System.out.println(age + " " + name);
    }

    public static void main(String[] args) {
         Encaps1 e = new Encaps1();
         e.age = 18;
         e.name = "Dev";
         e.call();
    }

}
