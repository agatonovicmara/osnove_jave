package d24_05_2022;

public class Transakcija {
    private int idTransakcije;
    private Racun racunSaKogSePrenoseSredstva;
    private Racun racunNaKojiSePrenoseSredstva;

    public Transakcija() {
    }

    public Transakcija(int idTransakcije, Racun racunSaKogSePrenoseSredstva, Racun racunNaKojiSePrenoseSredstva) {
        this.idTransakcije = idTransakcije;
        this.racunSaKogSePrenoseSredstva = racunSaKogSePrenoseSredstva;
        this.racunNaKojiSePrenoseSredstva = racunNaKojiSePrenoseSredstva;
    }

    public int getIdTransakcije() {
        return idTransakcije;
    }

    public void setIdTransakcije(int idTransakcije) {
        this.idTransakcije = idTransakcije;
    }

    public Racun getRacunSaKogSePrenoseSredstva() {
        return racunSaKogSePrenoseSredstva;
    }

    public void setRacunSaKogSePrenoseSredstva(Racun racunSaKogSePrenoseSredstva) {
        this.racunSaKogSePrenoseSredstva = racunSaKogSePrenoseSredstva;
    }

    public Racun getRacunNaKojiSePrenoseSredstva() {
        return racunNaKojiSePrenoseSredstva;
    }

    public void setRacunNaKojiSePrenoseSredstva(Racun racunNaKojiSePrenoseSredstva) {
        this.racunNaKojiSePrenoseSredstva = racunNaKojiSePrenoseSredstva;
    }

    private double provizija (double visinaTransakcije){
        double provizija=0;
        if (visinaTransakcije < 4500){
            provizija = 45;
        }else if (visinaTransakcije>4500){
            provizija = visinaTransakcije * 0.01;

        }return provizija;
    }


    public void izvrsiTransakciju(double visinaTransakcije) {
        if (this.racunSaKogSePrenoseSredstva.getTrenutnoStanje() >= visinaTransakcije
                + this.provizija(visinaTransakcije)) {
            this.racunSaKogSePrenoseSredstva.promenaStanja(-visinaTransakcije
                    - this.provizija(visinaTransakcije));
            this.racunNaKojiSePrenoseSredstva.promenaStanja(visinaTransakcije);
        } else {
            System.out.println("Nemate dovoljno sredstava za ovu transakciju.");
        }
    }




}
