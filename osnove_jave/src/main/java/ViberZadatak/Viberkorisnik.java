package ViberZadatak;

public class Viberkorisnik {
    private String punoIme;
    private String telefon;
    private boolean aktivan;

    public Viberkorisnik(String punoIme, String telefon, boolean aktivan) {
        this.punoIme = punoIme;
        this.telefon = telefon;
        this.aktivan = aktivan;
    }

    public Viberkorisnik() {
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public boolean isAktivan() {
        return aktivan;
    }

    public void setAktivan(boolean aktivan) {
        this.aktivan = aktivan;
    }

    public void aktivan(){

        if (aktivan=true){
            System.out.print("Korisnik je aktivan");
        }else{
            System.out.print("Korisnik nije aktivan.");
        }
    }
}
