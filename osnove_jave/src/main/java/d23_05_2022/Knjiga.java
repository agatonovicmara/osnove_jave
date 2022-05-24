package d23_05_2022;

public class Knjiga {
    private int isbn;
    private String naziv;
    private int godinaIzdanja;
    private Autor autor;

    public Knjiga() {
    }

    public int getisbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void print(){
        System.out.println(this.isbn);
        System.out.println(this.naziv + " - " + this.godinaIzdanja);
        //System.out.println // this.autor.getIme();
        this.autor.print();
    }
}
