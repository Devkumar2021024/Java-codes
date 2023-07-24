// Method Overriding
class Isro_Rocket {
    public void fueling() {
        System.out.println("Cryo gasses are pumped. ");
    }

    public void Liftoff() {
        System.out.println("Solid Boosters ignition started. ");
    }
}

class GSLV_MK2 extends Isro_Rocket {
    // Liftoff() method overriden
    public void Liftoff() {
        System.out.println("GSLV LIFTOFF NORMAL. ");
    }

    public void first_stage_saperation() {
        System.out.println("First stage saperated successfully. ");
    }
}

class LMV3 extends Isro_Rocket {
    public void Liftoff() {
        System.out.println("LMV LIFTOFF NORMAL . ");
    }
     public void fueling() {
        System.out.println("Cryo gasses are pumped. ");
    }

    public void fairing_saperation() {
        System.out.println("Head shield fairing saperated successfully. ");
    }
}

public class Fifth {
    public static void main(String[] args) {
        GSLV_MK2 r1 = new GSLV_MK2();
        LMV3 l1 = new LMV3();
        Isro_Rocket rock;

        // Parent class holding reference of child class
        rock = l1;
        rock.fueling();
        rock.Liftoff();

        rock = r1;
        rock.fueling();
        rock.Liftoff();

    }
}
