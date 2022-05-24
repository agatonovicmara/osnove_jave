package d23_05_2022;

public class Autor {
    private String ime;
    private String prezime;

    public Autor() {
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void print(){
        System.out.println("Autor: " + ime + " "+ prezime);
    }

}
