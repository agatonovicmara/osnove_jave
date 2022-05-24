package d23_05_2022;

public class AutorKnjigaMain {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setIme("Zoran");
        autor.setPrezime("Zivkovic");

        Autor autor1= new Autor();
        autor1.setIme("Borislav");
        autor1.setPrezime("Pekic");

        Knjiga knjiga = new Knjiga();
        knjiga.setIsbn(123456);
        knjiga.setNaziv("Skrivena Kamera");
        knjiga.setGodinaIzdanja(2017);
        knjiga.setAutor(autor);

        Knjiga knjiga1=new Knjiga();
        knjiga1.setIsbn(555666);
        knjiga1.setNaziv("Besnilo");
        knjiga1.setGodinaIzdanja(2019);
        knjiga1.setAutor(autor1);

        Knjiga knjiga2=new Knjiga();
        knjiga2.setIsbn(777888);
        knjiga2.setNaziv("Mediteranski Svetionik");
        knjiga2.setGodinaIzdanja(2020);
        knjiga2.setAutor(autor);

        autor.print();
        System.out.println();
        autor1.print();
        System.out.println();
        knjiga.print();
        System.out.println();
        knjiga1.print();
        System.out.println();
        knjiga2.print();
    }
}
