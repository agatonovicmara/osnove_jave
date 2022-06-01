package d31_05_2022_2_Zadatak;

import java.util.ArrayList;

public class OsobaKartonIgracMain {
    public static void main(String[] args) {

        ArrayList<Karton>nizKartona=new ArrayList<>();
        Karton k1 = new Karton("Zuti");
        Karton k2 = new Karton("Zuti");
        Karton k3 = new Karton("Zuti");
        Karton k4 = new Karton("Zuti");
        Karton k5 = new Karton("Crveni");
        Karton k6 = new Karton("Crveni");
        Karton k7 = new Karton("Crveni");
        Karton k8 = new Karton("Crveni");


        Igrac marko = new Igrac("Marko Markovic",
                "1106985766019", 1985, 9,
                "Napadac",  true);

        Igrac jovan = new Igrac("Jovan Pavlovic",
                "1109987761098", 1987, 8,
                "Odbrambeni", false);

        Igrac sasa = new Igrac("Sasa Jankovic",
                "19089880099887", 1988, 7,
                "Napadac", false);



        jovan.dodajKarton(k1);
        jovan.dodajKarton(k2);
        jovan.dodajKarton(k5);
        jovan.dodajKarton(k7);
        jovan.dodajKarton(k8);
        sasa.dodajKarton(k3);
        sasa.dodajKarton(k4);
        sasa.dodajKarton(k6);
        marko.dodajKarton(k5);
        marko.dodajKarton(k7);
        marko.dodajKarton(k8);
        marko.dodajKarton(k3);

//        nizKartona.add(k1);
//        nizKartona.add(k2);
//        nizKartona.add(k3);
//        nizKartona.add(k4);
//        nizKartona.add(k5);
//        nizKartona.add(k6);
//        nizKartona.add(k7);
//        nizKartona.add(k8);

        System.out.println("Crvenih kartona: "+ marko.crveni());

        System.out.println();

        sasa.print();
        System.out.println("Zutih kartona: "+ sasa.zuti());

        jovan.print();
        System.out.println("Crvenih kartona: "+ jovan.crveni());

        jovan.zuti();




    }
}
