package d30_05_2022;

import java.util.ArrayList;

public class KombinacijeListicMain {
    public static void main(String[] args) {

        Kombinacija dobitna = new Kombinacija("999", 14, 15, 16, 17, 34, 35, 23);
        Kombinacija k1 = new Kombinacija("111", 1, 10, 20,30, 22, 33, 11);
        Kombinacija k2 = new Kombinacija("222", 3, 4, 5,6, 7, 8, 9);
        Kombinacija k3 = new Kombinacija("333", 5, 15, 12,13, 14, 25, 34);
        Kombinacija k4 = new Kombinacija("444", 23, 22, 21,20, 29, 28, 27);
        Kombinacija k5 = new Kombinacija("555", 17, 18, 19,20, 21, 22, 23);
        Kombinacija k6 = new Kombinacija("897", 23, 24, 30, 31, 32, 33, 12);
        Kombinacija k7 = new Kombinacija("134", 1, 5, 11, 15, 25, 36, 21);
        Kombinacija k8 = new Kombinacija("199", 14, 15, 16, 17, 34, 35, 23);


        Listic listic1 = new Listic();
        Listic listic2 = new Listic();


        listic1.dodajKombinaciju(dobitna);

        listic1.dodajKombinaciju(k1);
        listic1.dodajKombinaciju(k2);
        listic1.dodajKombinaciju(k3);
        listic1.dodajKombinaciju(k4);
        listic1.dodajKombinaciju(k5);

        listic2.dodajKombinaciju(k6);
        listic2.dodajKombinaciju(k7);
        listic2.dodajKombinaciju(k8);


        listic1.print();
        System.out.println();
        listic2.print();

        boolean imamoLiPogodak = k8.daLiJeIstaKombinacija(dobitna);
        if (imamoLiPogodak == false) {
            System.out.println("Nemamo pogodak.");
        } else {
            System.out.println("Imamo pogodak loto kombinacije.");
        }


    }
}
