package d24_05_2022;

public class Racun {
    public Object getProvizija;
    private String punoIme;
    private String brojRacuna;
    private double trenutnoStanje;

    public Racun() {
    }

    public Racun(String punoIme, String brojRacuna, int trenutnoStanje) {
        this.punoIme = punoIme;
        this.brojRacuna = brojRacuna;
        this.trenutnoStanje = trenutnoStanje;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public double getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public double promenaStanja (double visinaTransakcije){
        trenutnoStanje=trenutnoStanje+visinaTransakcije;
        return trenutnoStanje;
    }

    public void print(){
        System.out.println(this.punoIme + " - "+ this.brojRacuna);
        System.out.println("Stanje na racunu je: "+trenutnoStanje+ " RSD.");
    }


}
