package d18_05_2022;

public class Proizvod {

    public String prizvod;
    public double cena;
    public double tezina;


    public void stampa() {
        System.out.println("Proizvod: " + this.prizvod);
        System.out.println("Cena: " + this.cena +" din.");
        System.out.println("Tezina: " + this.tezina + " gr.");
    }
}