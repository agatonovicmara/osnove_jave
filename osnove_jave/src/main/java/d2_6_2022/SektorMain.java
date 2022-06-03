package d2_6_2022;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;

public class SektorMain {
    public static void main(String[] args) {

        Sektor nabavka = new Sektor("Nabavka", 50000);
        Sektor magacin = new Sektor("Magacin", 60000);
        Sektor prodaja = new Sektor("Prodaja", 70000);
        Sektor proizvodnja = new Sektor("Proizvodnja", 100000);
        Sektor menadzment = new Sektor("Menadzment", 200000);

       Menadzer sasa = new Menadzer("Sasa Jankovic");
       Magacioner marko = new Magacioner("Marko Savic");

       ArrayList<Sektor>nizSektora=new ArrayList<>();
       nizSektora.add(nabavka);
       nizSektora.add(magacin);
       nizSektora.add(prodaja);
       nizSektora.add(proizvodnja);

       sasa.zaposliUsektor(nabavka);
       sasa.zaposliUsektor(prodaja);
       sasa.zaposliUsektor(menadzment);
       marko.zaposliUsektor(menadzment); // ako se magacioner Marko zaposli u menadzmentu, on dobije platu samo 100000!
      // marko.zaposliUsektor(proizvodnja);

        System.out.println(marko.plata());

        System.out.println(sasa.plata());


    }
}
