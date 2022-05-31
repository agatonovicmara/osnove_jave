package d30_05_2022;

import java.util.ArrayList;

public class Listic {

    private Kombinacija k1;
    ArrayList<Kombinacija> nizKombinacija = new ArrayList<>();

    public void dodajKombinaciju(Kombinacija k) {
        this.nizKombinacija.add(k);
    }


       public boolean daLiJeDobitna(Kombinacija k1) {
        int dobitnaKomb = 0;
        for (int i = 0; i < nizKombinacija.size(); i++) {
            if (nizKombinacija.get(i).daLiJeIstaKombinacija(k1)) {
                dobitnaKomb++;
            }

        }return dobitnaKomb>0;
}

    public void print() {
        System.out.println("Kombinacije: ");
        for (int i = 0; i < nizKombinacija.size(); i++) {
            nizKombinacija.get(i).print();

        }
    }
}







