package p3_6_2022_zadatak1;

import java.util.ArrayList;

public class IcePointMain {
    public static void main(String[] args) {

        ArrayList<Proizvod> proizvodi = new ArrayList<>();
        Proizvod icepoint1 = new IcePoint("Vanila", false);
        Proizvod icepoint2 = new IcePoint("Cokolada", true);
        Proizvod icepoint3 = new IcePoint("Jagoda", false);

        Proizvod pica1 = new Pica(150);
        Proizvod pica2 = new Pica(160);

        proizvodi.add(icepoint1);
        proizvodi.add(icepoint2);
        proizvodi.add(icepoint3);
        proizvodi.add(pica1);
        proizvodi.add(pica2);

        ArrayList<Dodatak> dodaci = new ArrayList<>();
        Dodatak kecap = new Dodatak("Kecap", 100);
        Dodatak origano = new Dodatak("Origano", 20);
        Dodatak sir = new Dodatak("sir", 100);
        Dodatak lesnik = new Dodatak("Lesnik", 10);
        Dodatak cokolada = new Dodatak("Cokolada", 20);
        Dodatak pecenica = new Dodatak("Pecenica", 100);
        Dodatak suviVrat = new Dodatak("Suvi Vrat", 120);
        Dodatak banana = new Dodatak("Banana", 123);

        dodaci.add(sir);
        dodaci.add(origano);
        dodaci.add(kecap);
        dodaci.add(cokolada);
        dodaci.add(lesnik);
        dodaci.add(pecenica);
        dodaci.add(suviVrat);
        dodaci.add(banana);


        pica1.ubaciDodatak(sir);
        pica1.ubaciDodatak(origano);
        pica1.ubaciDodatak(kecap);
        pica2.ubaciDodatak(origano);
        pica2.ubaciDodatak(kecap);
        pica2.ubaciDodatak(suviVrat);
        pica2.ubaciDodatak(pecenica);

        icepoint1.ubaciDodatak(lesnik);
        icepoint1.ubaciDodatak(cokolada);
        icepoint1.ubaciDodatak(banana);

      icepoint1.print();
      pica1.print();

      pica2.print();


    }
}
