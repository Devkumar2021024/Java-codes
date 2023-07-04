class Demo {
    private int a;
    private int b;

    // No argument constructor
    public Demo() {
        System.out.println("Zero parametrized constructor");
    }

    public Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println(a);
        System.out.println(b);
    }
}

public class Construct2 {
    public static void main(String[] args) 
    {
        Demo d=new Demo();
        d.disp();
        
        // We need to create constuctor
        Demo d2=new Demo(10, 20);
        d2.disp();

        
    }
}
