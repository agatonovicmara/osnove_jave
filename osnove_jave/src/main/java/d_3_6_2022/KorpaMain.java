package d_3_6_2022;

import java.util.ArrayList;

public class KorpaMain {
    public static void main(String[] args) {


        Ambalaza tetrapak1 = new Tetrapak("1234", "Tetrapak1", 10, 20, false, 12);
        Ambalaza tetrapak2 = new Tetrapak("2345", "Tetrapak2", 11, 21, true, 13);
        Ambalaza tetrapak3 = new Tetrapak("3456", "Tetrapak3", 12, 23, true, 14);

        Ambalaza staklena1 = new StaklenaAmbalaza("9999", "Flasa1", 17, 30, 16, true, 20);
        Ambalaza staklena2 = new StaklenaAmbalaza("8888", "Flasa2", 18, 32, 120, true, 16);

        SuperKartica s = new SuperKartica("12345", "Marija M.", 200);

        ArrayList<Ambalaza> ambalaze = new ArrayList<>();
        ambalaze.add(tetrapak1);
        ambalaze.add(tetrapak2);
        ambalaze.add(tetrapak3);
        ambalaze.add(staklena1);
        ambalaze.add(staklena2);


        Korpa k = new Korpa();
        k.dodajAmbalazu(tetrapak1);
        k.dodajAmbalazu(tetrapak2);
        k.dodajAmbalazu(tetrapak3);
        k.dodajAmbalazu(staklena1);
        k.dodajAmbalazu(staklena2);

        k.izbaciAmbalazu("2345");


        System.out.println("Ukupna cena korpe je: " + k.ukupnaCenaKorpe(s));

        tetrapak1.print();
        tetrapak2.print();
        tetrapak3.print();
        staklena1.print();
        staklena2.print();


    }
}
