// Getters and Setters in JAVA
class Modern {
    private String name;
    private int URN;
    private char section;

    // SETTERS
    public void setNAME(String name) {
        this.name = name;
    }

    public void setRoll_no(int URN) {
        this.URN = URN;
    }

    public void setSection(char section) {
        this.section = section;
    }

    // GETTERS
    public String getNAME() {
        return name;
    }

    public int getURN() {
        return URN;
    }

    public char getSection() {
        return section;
    }

}

public class Encaps4 {
    public static void main(String[] args) {
        Modern m = new Modern();
        m.setNAME("Dev kumar");
        m.setRoll_no(2004902);
        m.setSection('A');

    // Extracting the name from get function
        System.out.println("Name = " + m.getNAME());
        System.out.println("URN = " + m.getURN());
        System.out.println("Section = " + m.getSection());

    }
    // Git details
    //.+--
    
}
// Passing constructor 