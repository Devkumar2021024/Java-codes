// Constructr Overloading

class Overload {
    private String Name;
    private String section;

    public Overload() {
        this("Dev kumar", "D3IT-A1");

        // Called at least one time
        System.out.println("Deafult constructor");
        Name = "Dev kumar";
        section = "D3IT-A1";
        System.out.println();
    }

    public Overload(String Name) {
        this();
        this.Name = Name;
        section = "A2";
    }

    public Overload(String Name, String section) {
        this.Name = Name;
        this.section = section;
    }

    public void show() {
        System.out.println(Name);
        System.out.println(section);
    }

}

public class Construct3 {
    public static void main(String[] args) {
        Overload O = new Overload();
        O.show();

        Overload o = new Overload("Dev K");
        o.show();

        Overload Oo = new Overload("Aman Bijlwan", "D3itA1");
        Oo.show();
    }
}
