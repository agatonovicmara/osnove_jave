package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak3 {
    public static void main(String[] args) {
//        Napisati program koji ima niz brojeva duzine 10.
//        Niz je fiksnih vrednosti (ne u nosi ih korisnik)
//        a zatim se od korisnika ucitava pozicija elementa
//        koji zeli da izbaci iz niza.
//        Pre i nakon izbacivanja ispisati niz na ekranu.
//        Ukoliko korisnik unese poziciju van opsega niza,
//        ispisati poruku o gresci.
//        Commitujte zadatak i pushujte na github sa porukom
//        "Domaci 13.05.2022 Zadatak 3 brisanje iz niza“
//        Primer izvrsenja 1:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 5
//        Niz nakon brisanja je: 1,3,5,6,7,3,4,2,9
//
//        Primer izvrsenja 2:
//        Niz je: 1,3,5,6,7,1,3,4,2,9
//        Unesite poziciju za izbacivanje: 11
//        Uneli ste nevalidnu poziciju!

        ArrayList<Integer> nizBrojeva = new ArrayList<Integer>();
        nizBrojeva.add(0);
        nizBrojeva.add(1);
        nizBrojeva.add(2);
        nizBrojeva.add(3);
        nizBrojeva.add(4);
        nizBrojeva.add(5);
        nizBrojeva.add(6);
        nizBrojeva.add(7);
        nizBrojeva.add(8);
        nizBrojeva.add(9);

        Scanner s = new Scanner(System.in);

        System.out.print("NizBrojeva je: ");
        for (int i = 0; i < nizBrojeva.size(); i++) {
            System.out.print(nizBrojeva.get(i) + " ");

        }
        System.out.println();
        System.out.println("Unesite poziciju elementa koji zelite da izbacite iz niza: ");
        int izbaciti = s.nextInt();


        if (izbaciti < nizBrojeva.size()) {
            nizBrojeva.remove(izbaciti);
            System.out.print("NizBrojeva je: ");
            for (int i = 0; i < nizBrojeva.size(); i++) {
                System.out.print(nizBrojeva.get(i) + " ");

            }
        } else if (izbaciti >= nizBrojeva.size()) {
            System.out.println("Uneli ste nevalidnu poziciju.");
        }


    }
}
