package p3_6_2022_zadatak1;

public class Dodatak {
    protected String naziv;
    protected int cena;

    public Dodatak(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public Dodatak() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public void print(){
        System.out.println("Dodatak: "+this.naziv);
        System.out.println("Cena: "+ this.cena+ " din.");
    }
}
