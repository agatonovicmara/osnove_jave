package d19_05_2022;

public class Proizvod1 {

    public String prizvod;
    public double cena;
    public double tezina;


    public void stampa() {
        System.out.println("Proizvod: " + this.prizvod);
        System.out.println("Cena: " + this.cena +" din.");
        System.out.println("Tezina: " + this.tezina + " gr.");
    }

    public void povecajCenu (double povecanje){
       this.cena = this.cena + povecanje;
    }

    public double vratiCenuSaPopustom(double popust){
        double snizenaCena=this.cena - popust;
        return snizenaCena;
    }

    public double racunajPostarinu(){
        double postarina=0;
        if (this.tezina<100){
            postarina = 200;
        }
        if(this.tezina>101 && this.tezina<500){
            postarina=400;
        }
        if(this.tezina>=500){
            postarina=1000;
        }return postarina;
    }
}
