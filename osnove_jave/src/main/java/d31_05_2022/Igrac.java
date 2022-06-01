package d31_05_2022;

public class Igrac extends Osoba{
    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {
    }

    public Igrac(String punoIme, String jmbg, int godinaRodjenja,
                 int broj, String pozicija, boolean kapiten) {
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
    @Override
    public void print(){
        super.print();
        System.out.println("Broj: "+this.broj);
        System.out.println("Pozicija:"+ this.pozicija+". ");
        if(this.kapiten==true){
            System.out.println("Ovaj igrac je kapiten.");
        }else{
            System.out.println("Ovaj igrac nije kapiten.");
        }
    }
}
