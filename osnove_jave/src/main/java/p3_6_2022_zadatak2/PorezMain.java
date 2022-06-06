package p3_6_2022_zadatak2;

public class PorezMain {
    public static void main(String[] args) {
        PoreskaUprava nis = new PoreskaUprava("Nis");

        Objekat kuca = new Kuca ("Rudnicka 5", 150, 2, 3);
        Objekat zgrada = new Zgrada ("Rudnicka 2", 1000, 2, 7);
        Objekat lokal = new Lokal("Rudnicka 6", 300, 1);

        kuca.print();
        System.out.println();
        zgrada.print();
        System.out.println();
        lokal.print();

        nis.dodajObjekat(kuca);
        nis.dodajObjekat(zgrada);
        nis.dodajObjekat(lokal);

        System.out.println("Porez za ceo grad: "+nis.porezZaCeoGrad());
    }
}
