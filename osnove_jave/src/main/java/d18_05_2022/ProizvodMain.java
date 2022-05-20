package d18_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod cokolada = new Proizvod();
        cokolada.prizvod= "Cokolada";
        cokolada.cena=200;
        cokolada.tezina=100;

        cokolada.stampa();

        Proizvod limun = new Proizvod();
        limun.prizvod= "Limun";
        limun.cena= 300;
        limun.tezina= 1000;

        limun.stampa();

    }
}
