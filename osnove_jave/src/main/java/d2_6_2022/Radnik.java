package d2_6_2022;

import java.util.ArrayList;

public abstract class Radnik {
    protected String punoIme;



    ArrayList<Sektor> nizSektora = new ArrayList<>();




    public Radnik(String punoIme) {
        this.punoIme = punoIme;
    }

    public abstract double plata();

    public void zaposliUsektor(Sektor sektor) {
        nizSektora.add(sektor);
    }


}
