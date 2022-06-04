package d_3_6_2022;

import java.util.ArrayList;

public class Korpa {
    ArrayList<Ambalaza> ambalaze = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza a) {
        this.ambalaze.add(a);
    }

    public void izbaciAmbalazu(String barKod) {
        for (int i = 0; i < this.ambalaze.size(); i++) {
            if (this.ambalaze.get(i).getBarKod().equals(barKod)) {
                this.ambalaze.remove(i);
            }
        }

    }

    private double cenaSaPopustom(int popust) {
        double cenaSaPopustom = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            cenaSaPopustom = cenaSaPopustom + ambalaze.get(i).cena() - popust;
        }
        return cenaSaPopustom;
    }

    public double ukupnaCenaKorpe(SuperKartica popust) {
        double ukupnaCenaKorpe = 0;
        for (int i = 0; i < ambalaze.size(); i++) {
            ukupnaCenaKorpe = ukupnaCenaKorpe + ambalaze.get(i).cena();
        }
        return ukupnaCenaKorpe;
    }
}
