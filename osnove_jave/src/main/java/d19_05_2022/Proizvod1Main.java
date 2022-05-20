package d19_05_2022;

public class Proizvod1Main {
    public static void main(String[] args) {

        Proizvod1 cokolada = new Proizvod1();
        cokolada.prizvod= "Cokolada";
        cokolada.cena=200;
        cokolada.tezina=100;

        cokolada.stampa();
        System.out.println();

        Proizvod1 limun = new Proizvod1();
        limun.prizvod= "Limun";
        limun.cena= 300;
        limun.tezina= 1000;

        double povecanje = 23;

        limun.stampa();
        limun.povecajCenu(povecanje); // povecanje cene limuna 323
        System.out.println();
        limun.stampa();
        System.out.println();
        cokolada.povecajCenu(povecanje);
        System.out.println("Nova cena je: "+cokolada.cena);

        double popust = 50.0;


        double snizeno =  limun.vratiCenuSaPopustom(popust); // limun snizen za 50;
        System.out.println("Snizena cena je: "+snizeno);


       double cenaPostarine= limun.racunajPostarinu();
       System.out.println("Cena postarine je: "+ cenaPostarine);

    }
}
