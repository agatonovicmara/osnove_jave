package d2_6_2022;

public class Sektor {


    private String nazivSektora;
    private double plata;

    public String getNazivSektora() {
        return nazivSektora;
    }

    public void setNazivSektora(String nazivSektora) {
        this.nazivSektora = nazivSektora;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public Sektor(String nazivSektora, double plata) {
        this.nazivSektora = nazivSektora;
        this.plata = plata;
    }
}
