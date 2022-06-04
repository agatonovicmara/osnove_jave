package d_3_6_2022;

public class StaklenaAmbalaza extends Ambalaza {

    private double kaucija;
    private boolean daLiSePlacaKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barKod, String naziv, double neto,
                            double bruto, double kaucija,
                            boolean daLiSePlacaKaucija,
                            double osnovnaCena) {
        super(barKod, naziv, neto, bruto);
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(double kaucija, boolean daLiSePlacaKaucija, double osnovnaCena) {
        this.kaucija = kaucija;
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza() {
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isDaLiSePlacaKaucija() {
        return daLiSePlacaKaucija;
    }

    public void setDaLiSePlacaKaucija(boolean daLiSePlacaKaucija) {
        this.daLiSePlacaKaucija = daLiSePlacaKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena() {
        double cena = 0;
        if (daLiSePlacaKaucija == true) {
            cena = this.osnovnaCena * 1.2 + this.kaucija;
        } else {
            cena = this.osnovnaCena * 1.2;
        }
        return cena;
    }

    @Override
    public void print() {
        System.out.println("Kaucija za flasu: " + this.kaucija);
        System.out.print("Da li se placa kaucija: ");
        if (daLiSePlacaKaucija == true) {
            System.out.println("Placa se.");
        } else {
            System.out.println("Ne placa se.");
        }
        System.out.println("Osnovna cena ambalaze je: " + osnovnaCena);
        System.out.println("Cena ambalaze staklene flase je: " + this.cena());
    }
}
