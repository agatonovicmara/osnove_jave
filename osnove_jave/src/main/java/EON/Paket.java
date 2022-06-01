package EON;

public class Paket {
    protected String nazivPaketa;
    protected String korisnik;
    protected int cena;
    protected int ugovornaObaveza;
    protected int brzinaDownload;
    protected int brzinaUpload;


    public Paket() {
    }

    public Paket(String nazivPaketa, String korisnik, int cena,
                 int ugovornaObaveza,
                 int brzinaDownload, int brzinaUpload) {
        this.nazivPaketa = nazivPaketa;
        this.korisnik = korisnik;
        this.cena = cena;
        this.ugovornaObaveza = ugovornaObaveza;
        this.brzinaDownload = brzinaDownload;
        this.brzinaUpload = brzinaUpload;
    }

    public String getNazivPaketa() {
        return nazivPaketa;
    }

    public int getBrzinaDownload() {
        return brzinaDownload;
    }

    public int getBrzinaUpload() {
        return brzinaUpload;
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getUgovornaObaveza() {
        return ugovornaObaveza;
    }

    public void setUgovornaObaveza(int ugovornaObaveza) {
        this.ugovornaObaveza = ugovornaObaveza;
    }

    public void produziUgovor(){
        this.ugovornaObaveza=this.ugovornaObaveza+12;
    }
    public int brMeseciPo1Din(){
        return 0;
    }
    public void print(){
        System.out.println("Korisnik: "+this.korisnik);
        System.out.println("Naziv paketa: "+this.nazivPaketa);
        System.out.println("Download: "+this.brzinaDownload+
                " / Upload: "+this.brzinaUpload);
        System.out.println("Ugovorna obaveza: "+this.ugovornaObaveza);
        System.out.println("Cena: "+ this.cena);

    }
}
