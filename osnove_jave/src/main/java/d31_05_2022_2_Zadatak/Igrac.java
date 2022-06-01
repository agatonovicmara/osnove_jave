package d31_05_2022_2_Zadatak;

import java.util.ArrayList;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    ArrayList<Karton>nizKartona=new ArrayList<>();

    private boolean kapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg,
                 int godinaRodjenja,
                 int broj, String pozicija,
                 boolean kapiten) {
        super(punoIme, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;

    }

    public int getBroj() {
        return broj;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    public void dodajKarton(Karton k){
        this.nizKartona.add(k);
    }

    public int zuti(){
        int counter=0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if(nizKartona.get(i).getTipKartona().equals("Zuti")){
                counter=counter+1;
            }
        }return counter;
    }
    public int crveni(){
        int counter1=0;
        for (int i = 0; i < nizKartona.size(); i++) {
            if(nizKartona.get(i).getTipKartona().equals("Crveni")){
                counter1=counter1+1;
            }
        }return counter1;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Broj: "+this.broj);
        System.out.println("Pozicija: "+this.pozicija);
        if (this.kapiten){
            System.out.println("Igrac je kapiten u svom timu.");
        }else{
            System.out.println("Igrac nije kapiten.");
        }
    }
}
