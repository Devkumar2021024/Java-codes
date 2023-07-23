class Data{
        private String name;
        private int roll_no;

        Data(String name, int roll_no)
        {
            this.name = name;
            this.roll_no = roll_no;
        }

        
        public String getNAME()
        {
            return name;
        }

        public int getRoll_no()
        {
            return roll_no;
        }
}

public class Construct1 {
    public static void main(String[] args) {
        // Call to constructor
        Data d = new Data("Dev kumar", 2004902);
        

        String Name = d.getNAME();
        int roll_no = d.getRoll_no();

        System.out.println("Name = "+Name);
        System.out.println("Uinversity roll number = "+ roll_no);
    }

}

