package d24_05_2022;

public class ZeleniKarton {
    private String punoIme;
    private int brojIndeksa;
    private String nazivPredmeta;
    private String imeProfesora;
    private int ocena;

    public ZeleniKarton() {
    }

    public ZeleniKarton(String punoIme,
                        int brojIndeksa,
                        String nazivPredmeta,
                        String imeProfesora,
                        int ocena) {
        this.punoIme = punoIme;
        this.brojIndeksa = brojIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeProfesora = imeProfesora;
        this.ocena = ocena;
    }

    public String getPunoIme() {
        return punoIme;
    }

    public void setPunoIme(String punoIme) {
        this.punoIme = punoIme;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public boolean ispitPolozen(){
        return ocena > 5;
    }

    public void print(){
        System.out.println(this.nazivPredmeta +" - "+this.ocena);
        System.out.println("Student: " + this.punoIme +" broj indeksa: "+ this.brojIndeksa);
        System.out.println("Profesor: "+ this.imeProfesora);
        System.out.println();
    }


}
