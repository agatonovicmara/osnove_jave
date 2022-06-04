package d_3_6_2022;

public abstract class Ambalaza {
    protected String barKod;
    protected String naziv;
    protected double neto;
    protected double bruto;

    public Ambalaza(String barKod, String naziv, double neto, double bruto) {
        this.barKod = barKod;
        this.naziv = naziv;
        this.neto = neto;
        this.bruto = bruto;
    }

    public Ambalaza() {
    }

    public String getBarKod() {
        return barKod;
    }

    public void setBarKod(String barKod) {
        this.barKod = barKod;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }

    public double getBruto() {
        return bruto;
    }

    public void setBruto(double bruto) {
        this.bruto = bruto;
    }

    public double tezinaPakovanja() {
        double tezinaPakovanja = this.bruto - this.neto;
        return tezinaPakovanja;
    }

    public abstract double cena();

    public abstract void print();
}
