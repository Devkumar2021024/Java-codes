class Isro_Rocket {
    public void fueling() {
        System.out.println("Cryo gasses are pumped. ");
    }

    public void Liftoff() {
        System.out.println("Solid Boosters ignition started. ");
    }
}

class GSLV_MK2 extends Isro_Rocket {
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

    public void fairing_saperation() {
        System.out.println("Head shield fairing saperated successfully. ");
    }
}

public class Third {
    public static void main(String[] args) {
        GSLV_MK2 r1 = new GSLV_MK2();
        r1.fueling();
        r1.Liftoff();

        LMV3 l1 = new LMV3();
        l1.fueling();
        l1.Liftoff();
    }
}
