// This keyword in java to eliminate shadowing problem
class Dev {
    private String name;
    private int roll_no;
    private double marks;

    Dev(String name, int roll_no, double marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    public void main_function() {
        System.out.println("Name = " + this.name);
        System.out.println("Roll number = " + this.roll_no);
        System.out.println("Marks obtained = " + this.marks);
    }
}

public class Encaps3 {
    public static void main(String[] args) {
        Dev d = new Dev(null, 0, 0);
        d.main_function();
    }
}
