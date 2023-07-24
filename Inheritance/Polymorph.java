// More on polymnorphism
class ISRO {
    public void Liftoff() {
        System.out.println("Liftoff normal!!");
    }

    public void stage_saperation() {
        System.out.println("First stage sapretaed successfully.");
    }
}

class PSLV extends ISRO {
    public void Liftoff() {
        System.out.println("PSLV Liftoff normal!!");
    }

    public void stage_saperation() {
        System.out.println("PSLV First stage sapretaed successfully.");
    }
}

class GSLV_MK2 extends ISRO {
    public void Liftoff() {
        System.out.println("GSLV_MK2 Liftoff normal!!");
    }

    public void stage_saperation() {
        System.out.println("GSLV_MK2 First stage sapretaed successfully.");
    }
}

class LMV3 extends ISRO {
    public void Liftoff() {
        System.out.println("LMV3 Liftoff normal!!");
    }

    public void stage_saperation() {
        System.out.println("LMV3 First stage sapretaed successfully.");
    }
}

class Launch_site {
    public void poly(ISRO ref) {
        ref.Liftoff();
        ref.stage_saperation();
        System.out.println("-------------------------------------");
    }


}

public class Polymorph {
    public static void main(String[] args) {
        PSLV naviac = new PSLV();
        GSLV_MK2 nisar = new GSLV_MK2();
        LMV3 chandaryaan = new LMV3();

        Launch_site shar = new Launch_site();
        shar.poly(naviac);
        shar.poly(nisar);
        shar.poly(chandaryaan);
    }
}
