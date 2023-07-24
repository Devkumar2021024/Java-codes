package Interface;

interface A {
    public void show();
}
interface X {
    public void abc();
}

class B implements A,X {
    public void show() {
        System.out.println("Hum class show main hai. ");
    }
    public void abc() {
        System.out.println("Hum class abc main hai. ");
    }
}

public class Third {
    public static void main(String[] args) {
        // A b = new B();
        // b.show();
        // b.abc(); isme error aayega kyoki abc A mai nahi hai

        B b = new B();
        b.show();
        b.abc(); 

        

    }
}
