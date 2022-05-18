package VezbaZaTest;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak2 {
    public static void main(String[] args) {
//        Za potrebe loto igre na srecu, potrebno je napisati program koja ispisuje informaciju da li
//        je odigrana loto kombinacija upravo dobitna kombinacija. Korisnik unosi dva niza oba duzine
//        7, prvi niz predstavlja odigranu kombinaciju a drugi niz predstavlja izvucenu kombinaciju.
//        Program na kraju ispisuje da li je dobitna kombinacija.Primer poziva metoda:
//        Ako se unesu nizovi:
//         ● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena= {1,2 ,3, 7, 29, 30, 32}
//         ● Program stampa “Nije dobitna kombinacija”
//        Ako se metoda pozove za:
//         ● odigrana={1, 2, 3, 4, 5, 33, 29} i izvucena={1, 2, 3, 4, 5, 33, 29} vraca true.
//         ● Program stampa “Jeste dobitna kombinacija”

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> unetaKombinacija = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Odigrajte broj za loto kombinaciju: ");
            int broj = s.nextInt();
            unetaKombinacija.add(broj);
        }

        ArrayList<Integer> dobitnaKombinacija = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.print("Unesite broj dobitne kombinacije: ");
            int broj = s.nextInt();
            dobitnaKombinacija.add(broj);
        }

        Boolean dobitak = daLiJeDobitnaKombinacija(unetaKombinacija, dobitnaKombinacija);
        if (dobitak == true) {
            System.out.print("Uneta kombinacija je tacna!");
        } else {
            System.out.println("Uneta kombinacija je pogresna!");
        }
    }

    static boolean daLiJeDobitnaKombinacija(ArrayList<Integer> prvaKombinacija, ArrayList<Integer> drugaKombinacija) {
        int suma = 0;
        for (int i = 0; i < prvaKombinacija.size(); i++) {
            if (prvaKombinacija.get(i) == drugaKombinacija.get(i)) {
                suma = suma + 1;
            }
        }
        if (suma == prvaKombinacija.size()) {
            return true;
        } else {
            return false;
        }
    }
}
