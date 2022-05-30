package Pasta;

public class SastojakpastaMain {
    public static void main(String[] args) {


        Sastojak sastojak1 = new Sastojak("Bosiljak", 200);
        Sastojak sastojak2 = new Sastojak("Pelat", 300);
        Sastojak sastojak3 = new Sastojak("Parmezan", 400);

        Pasta pasta1 = new Pasta();

        pasta1.dodajSastojak(sastojak1);
        pasta1.dodajSastojak(sastojak2);
        pasta1.dodajSastojak(sastojak3);

        pasta1.stampaj();

        pasta1.cenaPaste();

        pasta1.brisanjeSastojka("Bosiljak");
        pasta1.stampaj();
    }
}
