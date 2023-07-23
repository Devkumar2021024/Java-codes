class Animal{
        void food()
        {
            System.out.println("Animal Needs Food. ");
        }
}
class Loin extends Animal{

}
public class Second {
    public static void main(String[] args) {
        Loin simba = new Loin();
        simba.food();
    }
}
