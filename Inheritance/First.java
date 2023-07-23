

class Human {
    private String name;
    int work;

    // Constructor
    Human() {
        System.out.println("Human class constructor. ");
        // Automatically included behind the scene of parent class by super method
    }

    void Hard_work() {
        work = 12;
        System.out.println("We need to de more work. ");
        System.out.println(work);
    }
}

class Robot extends Human {
void Display(){
    System.out.println("The work hours is : "+ work);
    // System.out.println("Maybe the name is :"+ name);
    // Private memebers will not pass in inheritance
}
}

public class First {
    public static void main(String[] args) {
        Robot rb = new Robot();
        rb.Hard_work();
        rb.Display();
    }
}
